DESCRIPTION = "Efficiently compute time from local and GMT time"

SECTION = "libs"
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PACKAGE_NAME=	"Time-Local"
MAINTAINER=	"M4SS <edoardo.morandi@m4ss.net>"
HOMEPAGE=	"https://metacpan.org/dist/${PACKAGE_NAME}"

LIC_FILES_CHKSUM = "file://LICENSE;md5=366fbed2ab51f147eeef7c68ee6ac3d8"

BASE_SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/${PACKAGE_NAME}"
SRC_URI[sha256sum] = "1d136b71bd041cbe6f66c43180ee79e675b72ad5a3596abd6a44d211072ada29"

SRC_URI = "${BASE_SRC_URI}-${PV}.tar.gz"
S = "${WORKDIR}/${PACKAGE_NAME}-${PV}"

UPSTREAM_CHECK_URI = "${HOMEPAGE}"
UPSTREAM_CHECK_REGEX = "${BASE_SRC_URI}-(?P<pver>\d+(\.\d+){1,2})\.tar\.gz"

inherit cpan allarch

RDEPENDS:${PN} += "carp-perl"
RDEPENDS:${PN} += "exporter-perl"
RDEPENDS:${PN} += "constant-perl"
RDEPENDS:${PN} += "parent-perl"

BBCLASSEXTEND = "native"
