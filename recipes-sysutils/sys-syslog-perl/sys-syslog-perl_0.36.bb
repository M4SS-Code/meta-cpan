DESCRIPTION = "Perl interface to the UNIX syslog(3) calls"

SECTION = "libs"
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PACKAGE_NAME=	"Sys-Syslog"
MAINTAINER=	"M4SS <edoardo.morandi@m4ss.net>"
HOMEPAGE=	"https://metacpan.org/dist/${PACKAGE_NAME}"

LIC_FILES_CHKSUM = "\
    file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
    file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61 \
"

BASE_SRC_URI = "https://cpan.metacpan.org/authors/id/S/SA/SAPER/${PACKAGE_NAME}"
SRC_URI[sha256sum] = "ed42a9e5ba04ad4856cc0cb5d38d289c3c5d3764543ec04efafc4af7e3378df8"

SRC_URI = "${BASE_SRC_URI}-${PV}.tar.gz"
S = "${WORKDIR}/${PACKAGE_NAME}-${PV}"

UPSTREAM_CHECK_URI = "${HOMEPAGE}"
UPSTREAM_CHECK_REGEX = "${BASE_SRC_URI}-(?P<pver>\d+(\.\d+){1,2})\.tar\.gz"

inherit cpan

RDEPENDS:${PN} += "carp-perl"
RDEPENDS:${PN} += "pathtools-perl"
RDEPENDS:${PN} += "socket-perl"
RDEPENDS:${PN} += "test-simple-perl"
RDEPENDS:${PN} += "xsloader-perl"

BBCLASSEXTEND = "native"
