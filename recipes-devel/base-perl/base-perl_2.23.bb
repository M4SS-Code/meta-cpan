DESCRIPTION = "Establish an ISA relationship with base classes at compile time"

SECTION = "libs"
LICENSE = ""

PACKAGE_NAME=	"base"
MAINTAINER=	"M4SS <edoardo.morandi@m4ss.net>"
HOMEPAGE=	"https://metacpan.org/dist/${PACKAGE_NAME}"

LIC_FILES_CHKSUM = ""

BASE_SRC_URI = "https://cpan.metacpan.org/authors/id/R/RJ/RJBS/${PACKAGE_NAME}"
SRC_URI[sha256sum] = "40f55841299a9fe6fab03cd098f94e9221fb516978e9ef40fd8ff2cbd6625dde"

SRC_URI = "${BASE_SRC_URI}-${PV}.tar.gz"
S = "${WORKDIR}/${PACKAGE_NAME}-${PV}"

UPSTREAM_CHECK_URI = "${HOMEPAGE}"
UPSTREAM_CHECK_REGEX = "${BASE_SRC_URI}-(?P<pver>\d+(\.\d+){1,2})\.tar\.gz"

inherit cpan allarch

RDEPENDS:${PN} += "test-simple-perl"

BBCLASSEXTEND = "native"
