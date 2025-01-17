DESCRIPTION = "Install the C libxml2 library on your system"

SECTION = "libs"
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PACKAGE_NAME=	"Alien-Libxml2"
MAINTAINER=	"M4SS <edoardo.morandi@m4ss.net>"
HOMEPAGE=	"https://metacpan.org/dist/${PACKAGE_NAME}"

LIC_FILES_CHKSUM = "file://LICENSE;md5=63223cf29c1f77ffed6d37ce22ed8510"

BASE_SRC_URI = "https://cpan.metacpan.org/authors/id/P/PL/PLICEASE/${PACKAGE_NAME}"
SRC_URI[sha256sum] = "f4a674099bbd5747c0c3b75ead841f3b244935d9ef42ba35368024bd611174c9"

SRC_URI = "${BASE_SRC_URI}-${PV}.tar.gz"
S = "${WORKDIR}/${PACKAGE_NAME}-${PV}"

UPSTREAM_CHECK_URI = "${HOMEPAGE}"
UPSTREAM_CHECK_REGEX = "${BASE_SRC_URI}-(?P<pver>\d+(\.\d+){1,2})\.tar\.gz"

inherit cpan

DEPENDS += "libxml2"
DEPENDS += "alien-build-perl-native"
DEPENDS += "alien-build-plugin-download-gitlab-perl-native"
DEPENDS += "extutils-cbuilder-perl-native"

RDEPENDS:${PN} += "alien-build-perl"
RDEPENDS:${PN} += "libxml2"

BBCLASSEXTEND = "native"
