DESCRIPTION = "Tools required for GNU style configure scripts on Windows"

SECTION = "libs"
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PACKAGE_NAME=	"Alien-MSYS"
MAINTAINER=	"M4SS <edoardo.morandi@m4ss.net>"
HOMEPAGE=	"https://metacpan.org/dist/${PACKAGE_NAME}"

LIC_FILES_CHKSUM = "file://LICENSE;md5=63223cf29c1f77ffed6d37ce22ed8510"

BASE_SRC_URI = "https://cpan.metacpan.org/authors/id/P/PL/PLICEASE/${PACKAGE_NAME}"
SRC_URI[sha256sum] = "13f9cab0ae2c7646e3bc369937ff8b85374236370089c25055176873d410e405"

SRC_URI = "${BASE_SRC_URI}-${PV}.tar.gz"
S = "${WORKDIR}/${PACKAGE_NAME}-${PV}"

UPSTREAM_CHECK_URI = "${HOMEPAGE}"
UPSTREAM_CHECK_REGEX = "${BASE_SRC_URI}-(?P<pver>\d+(\.\d+){1,2})\.tar\.gz"

inherit cpan allarch

DEPENDS += "alien-build-perl-native"
DEPENDS += "alien-build-plugin-extract-perl-native"
DEPENDS += "alien-build-plugin-decode-sourceforge-perl-native"
DEPENDS += "path-tiny-perl-native"

RDEPENDS:${PN} += "alien-build-perl"
RDEPENDS:${PN} += "env-perl"
RDEPENDS:${PN} += "path-tiny-perl"

BBCLASSEXTEND = "native"
