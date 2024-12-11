DESCRIPTION = "Write Perl bindings to non-Perl libraries with FFI. No XS \
required."

SECTION = "libs"
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PACKAGE_NAME=	"FFI-Platypus"
MAINTAINER=	"M4SS <edoardo.morandi@m4ss.net>"
HOMEPAGE=	"https://metacpan.org/dist/${PACKAGE_NAME}"

LIC_FILES_CHKSUM = "file://LICENSE;md5=da00e3cba633da21ff5f243ea4b23c9c"

BASE_SRC_URI = "https://cpan.metacpan.org/authors/id/P/PL/PLICEASE/${PACKAGE_NAME}"
SRC_URI[sha256sum] = "9d312312289e78735b45c311b7ac16a9e8da093f779bf69469c70afac4dd5b63"

SRC_URI = "\
    ${BASE_SRC_URI}-${PV}.tar.gz \
   file://0001-fix-compilation-for-target.patch \
"
S = "${WORKDIR}/${PACKAGE_NAME}-${PV}"

UPSTREAM_CHECK_URI = "${HOMEPAGE}"
UPSTREAM_CHECK_REGEX = "${BASE_SRC_URI}-(?P<pver>\d+(\.\d+){1,2})\.tar\.gz"

inherit cpan

DEPENDS += "alien-ffi-perl-native"
DEPENDS += "capture-tiny-perl-native"

RDEPENDS:${PN} += "libffi"
RDEPENDS:${PN} += "capture-tiny-perl"
RDEPENDS:${PN} += "perl-module-extutils-makemaker"
RDEPENDS:${PN} += "ffi-checklib-perl"
RDEPENDS:${PN} += "perl-module-file-spec"
RDEPENDS:${PN} += "perl-module-ipc-cmd"
RDEPENDS:${PN} += "perl-module-json-pp"
RDEPENDS:${PN} += "perl-module-list-util"
RDEPENDS:${PN} += "perl-module-autodie"
RDEPENDS:${PN} += "perl-module-constant"
RDEPENDS:${PN} += "perl-module-parent"

do_compile:prepend() {
    export YOCTO_IS_BUILDING=1
}

do_compile:append() {
    if test -e blib/bin/dlrun-build; then rm blib/bin/dlrun-build; fi
}

BBCLASSEXTEND = "native"
