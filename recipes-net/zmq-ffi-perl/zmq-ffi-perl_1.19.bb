DESCRIPTION = "Version agnostic Perl bindings for ØMQ using ffi"

SECTION = "libs"
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PACKAGE_NAME=	"ZMQ-FFI"
MAINTAINER=	"M4SS <edoardo.morandi@m4ss.net>"
HOMEPAGE=	"https://metacpan.org/dist/${PACKAGE_NAME}"

LIC_FILES_CHKSUM = "file://LICENSE;md5=4f897276c64e21bd94ecd59745792624"

BASE_SRC_URI = "https://cpan.metacpan.org/authors/id/G/GH/GHENRY/${PACKAGE_NAME}"
SRC_URI[sha256sum] = "dc68f9407e58a23f79aa5254941f11204e5386fb1a6c1def412f9448f723b24f"

SRC_URI = "\
    ${BASE_SRC_URI}-${PV}.tar.gz \
    file://0001-fix-compilation.patch \
"
S = "${WORKDIR}/${PACKAGE_NAME}-${PV}"

UPSTREAM_CHECK_URI = "${HOMEPAGE}"
UPSTREAM_CHECK_REGEX = "${BASE_SRC_URI}-(?P<pver>\d+(\.\d+){1,2})\.tar\.gz"

inherit cpan

DEPENDS += "ffi-checklib-perl-native"
DEPENDS += "ffi-platypus-perl-native"

RDEPENDS:${PN} += "zeromq"
RDEPENDS:${PN} += "perl-module-carp"
RDEPENDS:${PN} += "class-xsaccessor-perl"
RDEPENDS:${PN} += "perl-module-exporter"
RDEPENDS:${PN} += "ffi-checklib-perl"
RDEPENDS:${PN} += "ffi-platypus-perl"
RDEPENDS:${PN} += "import-into-perl"
RDEPENDS:${PN} += "perl-module-math-bigint"
RDEPENDS:${PN} += "moo-perl"
RDEPENDS:${PN} += "perl-module-scalar-util"
RDEPENDS:${PN} += "sub-exporter-perl"
RDEPENDS:${PN} += "try-tiny-perl"
RDEPENDS:${PN} += "perl-module-bytes"
RDEPENDS:${PN} += "perl-module-feature"
RDEPENDS:${PN} += "perl-module-if"
RDEPENDS:${PN} += "namespace-clean-perl"
RDEPENDS:${PN} += "perl-module-strict"
RDEPENDS:${PN} += "perl-module-threads"
RDEPENDS:${PN} += "perl-module-warnings"

BBCLASSEXTEND = "native"
