DESCRIPTION = "This modules provides an IO:: style interface to the \
Compress::Zlib package. The main advantage is that you can use an IO::Zlib \
object in much the same way as an IO::File object so you can have common code \
that doesn't know which sort of file it is using."

SECTION = "libs"
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PACKAGE_NAME=	"IO-Zlib"
MAINTAINER=	"M4SS <edoardo.morandi@m4ss.net>"
HOMEPAGE=	"https://metacpan.org/dist/${PACKAGE_NAME}"

LIC_FILES_CHKSUM = "\
    file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
    file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61 \
"

BASE_SRC_URI = "https://cpan.metacpan.org/authors/id/T/TO/TOMHUGHES/${PACKAGE_NAME}"
SRC_URI[sha256sum] = "7ad887792e37cc3ffd64681a3e7483c5f789b44a033f340bc771e45832ebff32"

SRC_URI = "${BASE_SRC_URI}-${PV}.tar.gz"
S = "${WORKDIR}/${PACKAGE_NAME}-${PV}"

UPSTREAM_CHECK_URI = "${HOMEPAGE}"
UPSTREAM_CHECK_REGEX = "${BASE_SRC_URI}-(?P<pver>\d+(\.\d+){1,2})\.tar\.gz"

inherit cpan allarch

RDEPENDS:${PN} += "io-compress-perl"

BBCLASSEXTEND = "native"
