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
DEPENDS += "extutils-cbuilder-perl-native"
DEPENDS += "capture-tiny-perl-native"
DEPENDS += "extutils-parsexs-perl-native"
DEPENDS += "ipc-cmd-perl-native"
DEPENDS += "json-pp-perl-native"
DEPENDS += "parent-perl-native"

RDEPENDS:${PN} += "capture-tiny-perl"
RDEPENDS:${PN} += "extutils-makemaker-perl"
RDEPENDS:${PN} += "ffi-checklib-perl"
RDEPENDS:${PN} += "pathtools-perl"
RDEPENDS:${PN} += "ipc-cmd-perl"
RDEPENDS:${PN} += "json-pp-perl"
RDEPENDS:${PN} += "scalar-list-utils-perl"
RDEPENDS:${PN} += "autodie-perl"
RDEPENDS:${PN} += "constant-perl"
RDEPENDS:${PN} += "parent-perl"

export BUILD_ARCH
EXTRA_CPANFLAGS = "BUILD_CFLAGS='${BUILD_CFLAGS}' BUILD_CCFLAGS='${BUILD_CFLAGS}' BUILD_LDFLAGS='${BUILD_LDFLAGS}' BUILD_OPTIMIZE='${BUILD_OPTIMIZATION}'"

do_configure:append:class-target () {
    sed -E -i "s#([a-Z0-9_/.-]+?)(/ExtUtils/typemap)(\$|[^a-Z0-9_/.-])#${RECIPE_SYSROOT_NATIVE}\1\2\3#" Makefile
}

do_compile:prepend() {
    export YOCTO_IS_BUILDING=1
}

do_compile:append() {
    if test -e blib/bin/dlrun-build; then rm blib/bin/dlrun-build; fi
}

BBCLASSEXTEND = "native"
