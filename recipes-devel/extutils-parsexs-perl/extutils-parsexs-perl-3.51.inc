DESCRIPTION = "Utilities to convert Perl XS code into C code and to work with \
XS files"

SECTION = "libs"
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PACKAGE_NAME=	"ExtUtils-ParseXS"
MAINTAINER=	"M4SS <edoardo.morandi@m4ss.net>"
HOMEPAGE=	"https://metacpan.org/dist/${PACKAGE_NAME}"

LIC_FILES_CHKSUM = "\
    file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
    file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61 \
"

BASE_SRC_URI = "https://cpan.metacpan.org/authors/id/L/LE/LEONT/${PACKAGE_NAME}"
SRC_URI[sha256sum] = "82431a57425d78682acefb3a2cc9287683d091c8d034b825c584d9805bed6535"

SRC_URI = "${BASE_SRC_URI}-${PV}.tar.gz \
           file://0001-remove-exe-files.patch \
           "
S = "${WORKDIR}/${PACKAGE_NAME}-${PV}"

UPSTREAM_CHECK_URI = "${HOMEPAGE}"
UPSTREAM_CHECK_REGEX = "${BASE_SRC_URI}-(?P<pver>\d+(\.\d+){1,2})\.tar\.gz"

inherit cpan allarch update-alternatives

RDEPENDS:${PN} += "carp-perl"
RDEPENDS:${PN} += "pathtools-perl"
RDEPENDS:${PN} += "exporter-perl"
RDEPENDS:${PN} += "extutils-cbuilder-perl"
RDEPENDS:${PN} += "extutils-makemaker-perl"
RDEPENDS:${PN} += "test-simple-perl"

ALTERNATIVE_PRIORITY = "90"

ALTERNATIVE:${PN} = "xsubpp"
ALTERNATIVE_LINK_NAME[xsubpp] = "${bindir}/xsubpp"
