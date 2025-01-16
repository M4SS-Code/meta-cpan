DESCRIPTION = "Pure-Perl Core-Only replacement for pkg-config"

SECTION = "libs"
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PACKAGE_NAME=	"PkgConfig"
MAINTAINER=	"M4SS <edoardo.morandi@m4ss.net>"
HOMEPAGE=	"https://metacpan.org/dist/${PACKAGE_NAME}"

LIC_FILES_CHKSUM = "file://LICENSE;md5=f5f9204c26e68728d6a0499f563ab883"

BASE_SRC_URI = "https://cpan.metacpan.org/authors/id/P/PL/PLICEASE/${PACKAGE_NAME}"
SRC_URI[sha256sum] = "4dba5ed3c2d6a681b95c5ebf14b6a6995ce6991ae4719bad7f1aaf38e987c2a0"

SRC_URI = "${BASE_SRC_URI}-${PV}.tar.gz"
S = "${WORKDIR}/${PACKAGE_NAME}-${PV}"

UPSTREAM_CHECK_URI = "${HOMEPAGE}"
UPSTREAM_CHECK_REGEX = "${BASE_SRC_URI}-(?P<pver>\d+(\.\d+){1,2})\.tar\.gz"

inherit cpan allarch

RDEPENDS:${PN} += "test-simple-perl"

BBCLASSEXTEND = "native"
