DESCRIPTION = "Provide an interface to ZIP archive files."

SECTION = "libs"
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PACKAGE_NAME=	"Archive-Zip"
MAINTAINER=	"M4SS <edoardo.morandi@m4ss.net>"
HOMEPAGE=	"https://metacpan.org/dist/${PACKAGE_NAME}"

LIC_FILES_CHKSUM = "\
    file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
    file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61 \
"

BASE_SRC_URI = "https://cpan.metacpan.org/authors/id/P/PH/PHRED/${PACKAGE_NAME}"
SRC_URI[sha256sum] = "984e185d785baf6129c6e75f8eb44411745ac00bf6122fb1c8e822a3861ec650"

SRC_URI = "${BASE_SRC_URI}-${PV}.tar.gz"
S = "${WORKDIR}/${PACKAGE_NAME}-${PV}"

UPSTREAM_CHECK_URI = "${HOMEPAGE}"
UPSTREAM_CHECK_REGEX = "${BASE_SRC_URI}-(?P<pver>\d+(\.\d+){1,2})\.tar\.gz"

inherit cpan allarch

RDEPENDS:${PN} += "perl-module-compress-raw-zlib"
RDEPENDS:${PN} += "perl-module-encode"
RDEPENDS:${PN} += "perl-module-file-basename"
RDEPENDS:${PN} += "perl-module-file-copy"
RDEPENDS:${PN} += "perl-module-file-find"
RDEPENDS:${PN} += "perl-module-file-path"
RDEPENDS:${PN} += "perl-module-file-spec"
RDEPENDS:${PN} += "perl-module-file-temp"
RDEPENDS:${PN} += "perl-module-io-file"
RDEPENDS:${PN} += "perl-module-io-handle"
RDEPENDS:${PN} += "perl-module-io-seekable"
RDEPENDS:${PN} += "perl-module-time-local"

BBCLASSEXTEND = "native"
