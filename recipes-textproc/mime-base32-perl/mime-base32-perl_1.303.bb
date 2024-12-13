DESCRIPTION = "Base32 encoder and decoder"

SECTION = "libs"
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PACKAGE_NAME=	"MIME-Base32"
MAINTAINER=	"M4SS <edoardo.morandi@m4ss.net>"
HOMEPAGE=	"https://metacpan.org/dist/${PACKAGE_NAME}"

LIC_FILES_CHKSUM = "file://LICENSE;md5=98002d2cbb0108e0318f60ebae932532"

BASE_SRC_URI = "https://cpan.metacpan.org/authors/id/R/RE/REHSACK/${PACKAGE_NAME}"
SRC_URI[sha256sum] = "ab21fa99130e33a0aff6cdb596f647e5e565d207d634ba2ef06bdbef50424e99"

SRC_URI = "${BASE_SRC_URI}-${PV}.tar.gz"
S = "${WORKDIR}/${PACKAGE_NAME}-${PV}"

UPSTREAM_CHECK_URI = "${HOMEPAGE}"
UPSTREAM_CHECK_REGEX = "${BASE_SRC_URI}-(?P<pver>\d+(\.\d+){1,2})\.tar\.gz"

inherit cpan allarch

RDEPENDS:${PN} += "exporter-perl"

BBCLASSEXTEND = "native"
