DESCRIPTION = "Find or build xz"

SECTION = "libs"
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PACKAGE_NAME=	"Alien-xz"
MAINTAINER=	"M4SS <edoardo.morandi@m4ss.net>"
HOMEPAGE=	"https://metacpan.org/dist/${PACKAGE_NAME}"

LIC_FILES_CHKSUM = "file://LICENSE;md5="

BASE_SRC_URI = "https://cpan.metacpan.org/authors/id/P/PL/PLICEASE/${PACKAGE_NAME}"
SRC_URI[sha256sum] = "bfdb40fdb4ce56ac13b43686061cf6f60bf5ce01247c443ab36f88e5de3bb595"

SRC_URI = "${BASE_SRC_URI}-${PV}.tar.gz"
S = "${WORKDIR}/${PACKAGE_NAME}-${PV}"

UPSTREAM_CHECK_URI = "${HOMEPAGE}"
UPSTREAM_CHECK_REGEX = "${BASE_SRC_URI}-(?P<pver>\d+(\.\d+){1,2})\.tar\.gz"

inherit cpan allarch

DEPENDS += "alien-build-perl-native"
DEPENDS += "alien-build-plugin-build-autoconf-perl-native"
DEPENDS += "alien-build-plugin-download-perl-native"

RDEPENDS:${PN} += "alien-build"

BBCLASSEXTEND = "native"
