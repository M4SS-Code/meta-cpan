DESCRIPTION = "Return name and handle of a temporary file safely"

SECTION = "libs"
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PACKAGE_NAME=	"File-Temp"
MAINTAINER=	"M4SS <edoardo.morandi@m4ss.net>"
HOMEPAGE=	"https://metacpan.org/dist/${PACKAGE_NAME}"

LIC_FILES_CHKSUM = "file://LICENSE;md5=e160082b3b78133244f100ae2a3a5caa"

BASE_SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/${PACKAGE_NAME}"
SRC_URI[sha256sum] = "2290d61bf5c39882fc3311da9ce1c7f42dbdf825ae169e552c59fe4598b36f4a"

SRC_URI = "${BASE_SRC_URI}-${PV}.tar.gz"
S = "${WORKDIR}/${PACKAGE_NAME}-${PV}"

UPSTREAM_CHECK_URI = "${HOMEPAGE}"
UPSTREAM_CHECK_REGEX = "${BASE_SRC_URI}-(?P<pver>\d+(\.\d+){1,2})\.tar\.gz"

inherit cpan allarch

RDEPENDS:${PN} += "carp-perl"
RDEPENDS:${PN} += "pathtools-perl"
RDEPENDS:${PN} += "exporter-perl"
RDEPENDS:${PN} += "file-path-perl"
RDEPENDS:${PN} += "io-perl"
RDEPENDS:${PN} += "scalar-list-utils-perl"
RDEPENDS:${PN} += "constant-perl"
RDEPENDS:${PN} += "parent-perl"

BBCLASSEXTEND = "native"
