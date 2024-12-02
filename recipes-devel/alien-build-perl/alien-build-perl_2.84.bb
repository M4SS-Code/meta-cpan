DESCRIPTION = "Build external dependencies for use in CPAN"

SECTION = "libs"
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PACKAGE_NAME=	"Alien-Build"
MAINTAINER=	"M4SS <edoardo.morandi@m4ss.net>"
HOMEPAGE=	"https://metacpan.org/dist/${PACKAGE_NAME}"

LIC_FILES_CHKSUM = "file://LICENSE;md5=3f954fe1589181942a319bbb4c8e1334"

BASE_SRC_URI = "https://cpan.metacpan.org/authors/id/P/PL/PLICEASE/${PACKAGE_NAME}"
SRC_URI[sha256sum] = "8e891fd3acbac39dd8fdc01376b9abff931e625be41e0910ca30ad59363b4477"

SRC_URI = "${BASE_SRC_URI}-${PV}.tar.gz"
S = "${WORKDIR}/${PACKAGE_NAME}-${PV}"

UPSTREAM_CHECK_URI = "${HOMEPAGE}"
UPSTREAM_CHECK_REGEX = "${BASE_SRC_URI}-(?P<pver>\d+(\.\d+){1,2})\.tar\.gz"

inherit cpan

# Bootstrapping dependencies. Uncomment all and remove this line when finished.

# Perl Plugin Package Name
PPPN = "alien-build-plugin"

# PACKAGES =+ "${PPPN}-build-msys-perl"
PACKAGES =+ "${PPPN}-build-autoconf-perl"
PACKAGES =+ "${PPPN}-build-searchdep-perl"
# PACKAGES =+ "${PPPN}-build-cmake-perl"
# PACKAGES =+ "${PPPN}-build-make-perl"
PACKAGES =+ "${PPPN}-decode-perl"
# PACKAGES =+ "${PPPN}-digest-perl"
PACKAGES =+ "${PPPN}-download-perl"
PACKAGES =+ "${PPPN}-extract-perl"
# PACKAGES =+ "${PPPN}-extract-commandline-perl"
# PACKAGES =+ "${PPPN}-extract-negotiate-perl"
PACKAGES =+ "${PPPN}-gather-perl"
PACKAGES =+ "${PPPN}-fetch-perl"
# PACKAGES =+ "${PPPN}-pkgconfig-perl"
# PACKAGES =+ "${PPPN}-prefer-perl"
# PACKAGES =+ "${PPPN}-probe-perl"
PACKAGES =+ "${PPPN}-test-perl"

# PROVIDES =+ "${PPPN}-build-msys-perl"
PROVIDES =+ "${PPPN}-build-autoconf-perl"
PROVIDES =+ "${PPPN}-build-searchdep-perl"
# PROVIDES =+ "${PPPN}-build-cmake-perl"
# PROVIDES =+ "${PPPN}-build-make-perl"
PROVIDES =+ "${PPPN}-decode-perl"
# PROVIDES =+ "${PPPN}-digest-perl"
PROVIDES =+ "${PPPN}-download-perl"
PROVIDES =+ "${PPPN}-extract-perl"
# PROVIDES =+ "${PPPN}-extract-commandline-perl"
# PROVIDES =+ "${PPPN}-extract-negotiate-perl"
PROVIDES =+ "${PPPN}-gather-perl"
PROVIDES =+ "${PPPN}-fetch-perl"
# PROVIDES =+ "${PPPN}-pkgconfig-perl"
# PROVIDES =+ "${PPPN}-prefer-perl"
# PROVIDES =+ "${PPPN}-probe-perl"
PROVIDES =+ "${PPPN}-test-perl"

FILES:${PN} = "\
    ${PERLLIBDIRS}/vendor_perl/*/*.pm \
    ${PERLLIBDIRS}/vendor_perl/*/Test \
    ${PERLLIBDIRS}/vendor_perl/*/Alien/*.pm \
    ${PERLLIBDIRS}/vendor_perl/*/Alien/Base \
    ${PERLLIBDIRS}/vendor_perl/*/Alien/Build/*.pod \
    ${PERLLIBDIRS}/vendor_perl/*/Alien/Build/*.pm \
    ${PERLLIBDIRS}/vendor_perl/*/Alien/Build/Manual \
    ${PERLLIBDIRS}/vendor_perl/*/Alien/Build/Version \
    ${PERLLIBDIRS}/vendor_perl/*/Alien/Build/Interpolate \
    ${PERLLIBDIRS}/vendor_perl/*/Alien/Build/Log \
    ${PERLLIBDIRS}/vendor_perl/*/Alien/Build/Plugin/Core* \
    ${PERLLIBDIRS}/vendor_perl/*/Alien/Build/Plugin/Build.pod \
    ${PERLLIBDIRS}/vendor_perl/*/Alien/Build/Plugin/Build/Copy.pm \
    ${PERLLIBDIRS}/vendor_perl/*/Alien/Build/Plugin/Build/Autoconf.pm \
"

# Bootstrapping dependencies. Remove deletion of files and this line when finished.
do_install:append () {
    rm -rf \
        ${D}/${PERLLIBDIRS}/vendor_perl/*/Alien/Build/Plugin/Build/MSYS.pm \
        ${D}/${PERLLIBDIRS}/vendor_perl/*/Alien/Build/Plugin/Build/CMake.pm \
        ${D}/${PERLLIBDIRS}/vendor_perl/*/Alien/Build/Plugin/Build/Make.pm \
        ${D}/${PERLLIBDIRS}/vendor_perl/*/Alien/Build/Plugin/Digest* \
        ${D}/${PERLLIBDIRS}/vendor_perl/*/Alien/Build/Plugin/Extract/CommandLine.pm \
        ${D}/${PERLLIBDIRS}/vendor_perl/*/Alien/Build/Plugin/Extract/Negotiate.pm \
        ${D}/${PERLLIBDIRS}/vendor_perl/*/Alien/Build/Plugin/PkgConfig* \
        ${D}/${PERLLIBDIRS}/vendor_perl/*/Alien/Build/Plugin/Prefer* \
        ${D}/${PERLLIBDIRS}/vendor_perl/*/Alien/Build/Plugin/Probe*
}

# FILES:${PPPN}-build-msys-perl = "${PERLLIBDIRS}/vendor_perl/*/Alien/Build/Plugin/Build/MSYS.pm"
FILES:${PPPN}-build-autoconf-perl = "${PERLLIBDIRS}/vendor_perl/*/Alien/Build/Plugin/Build/Autoconf.pm"
FILES:${PPPN}-build-searchdep-perl = "${PERLLIBDIRS}/vendor_perl/*/Alien/Build/Plugin/Build/SearchDep.pm"
# FILES:${PPPN}-build-cmake-perl = "${PERLLIBDIRS}/vendor_perl/*/Alien/Build/Plugin/Build/CMake.pm"
# FILES:${PPPN}-build-make-perl = "${PERLLIBDIRS}/vendor_perl/*/Alien/Build/Plugin/Build/Make.pm"
FILES:${PPPN}-decode-perl = "${PERLLIBDIRS}/vendor_perl/*/Alien/Build/Plugin/Decode*"
# FILES:${PPPN}-digest-perl = "${PERLLIBDIRS}/vendor_perl/*/Alien/Build/Plugin/Digest*"
FILES:${PPPN}-download-perl = "${PERLLIBDIRS}/vendor_perl/*/Alien/Build/Plugin/Download*"
FILES:${PPPN}-extract-perl = "\
    ${PERLLIBDIRS}/vendor_perl/*/Alien/Build/Plugin/Extract.pod \
    ${PERLLIBDIRS}/vendor_perl/*/Alien/Build/Plugin/Extract/ArchiveTar.pm \
    ${PERLLIBDIRS}/vendor_perl/*/Alien/Build/Plugin/Extract/ArchiveZip.pm \
    ${PERLLIBDIRS}/vendor_perl/*/Alien/Build/Plugin/Extract/Directory.pm \
    ${PERLLIBDIRS}/vendor_perl/*/Alien/Build/Plugin/Extract/File.pm \
"
# FILES:${PPPN}-extract-commandline-perl = "${PERLLIBDIRS}/vendor_perl/*/Alien/Build/Plugin/Extract/CommandLine.pm"
# FILES:${PPPN}-extract-negotiate-perl = "${PERLLIBDIRS}/vendor_perl/*/Alien/Build/Plugin/Extract/Negotiate.pm"
FILES:${PPPN}-gather-perl = "${PERLLIBDIRS}/vendor_perl/*/Alien/Build/Plugin/Gather*"
FILES:${PPPN}-fetch-perl = "${PERLLIBDIRS}/vendor_perl/*/Alien/Build/Plugin/Fetch*"
# FILES:${PPPN}-pkgconfig-perl = "${PERLLIBDIRS}/vendor_perl/*/Alien/Build/Plugin/PkgConfig*"
# FILES:${PPPN}-prefer-perl = "${PERLLIBDIRS}/vendor_perl/*/Alien/Build/Plugin/Prefer*"
# FILES:${PPPN}-probe-perl = "${PERLLIBDIRS}/vendor_perl/*/Alien/Build/Plugin/Probe*"
FILES:${PPPN}-test-perl = "${PERLLIBDIRS}/vendor_perl/*/Alien/Build/Plugin/Test*"

DEPENDS += "extutils-cbuilder-perl-native"
DEPENDS += "extutils-parsexs-perl-native"
DEPENDS += "file-which-perl-native"

RDEPENDS:${PN} += "capture-tiny-perl"
RDEPENDS:${PN} += "extutils-cbuilder-perl"
RDEPENDS:${PN} += "extutils-makemaker-perl"
RDEPENDS:${PN} += "extutils-parsexs-perl"
RDEPENDS:${PN} += "ffi-checklib-perl"
RDEPENDS:${PN} += "file-which-perl"
RDEPENDS:${PN} += "file-chdir-perl"
RDEPENDS:${PN} += "json-pp-perl"
RDEPENDS:${PN} += "scalar-list-utils-perl"
RDEPENDS:${PN} += "path-tiny-perl"
RDEPENDS:${PN} += "test-simple-perl"
RDEPENDS:${PN} += "text-parsewords-perl"
RDEPENDS:${PN} += "parent-perl"

# RDEPENDS:${PPPN}-build-msys-perl += "${PN}"
# # TODO: conditionally depend on this on Windows
# # RDEPENDS:${PPPN}-build-msys-perl += "alien-msys-perl"

RDEPENDS:${PPPN}-build-autoconf-perl += "${PN}"
# TODO: conditionally depend on this on Windows
# RDEPENDS:${PPPN}-build-autoconf-perl += "${PPPN}-build-msys-perl"

RDEPENDS:${PPPN}-build-searchdep-perl += "${PN}"
RDEPENDS:${PPPN}-build-searchdep-perl += "env-shellwords-perl"

# RDEPENDS:${PPPN}-build-cmake-perl += "${PN}"
# RDEPENDS:${PPPN}-build-cmake-perl += "alien-cmake3-perl"
# RDEPENDS:${PPPN}-build-cmake-perl += "alien-gmake-perl"
# 
# RDEPENDS:${PPPN}-build-make-perl += "${PN}"
# RDEPENDS:${PPPN}-build-make-perl += "alien-cmake3-perl"
# RDEPENDS:${PPPN}-build-make-perl += "alien-gmake-perl"

RDEPENDS:${PPPN}-decode-perl += "${PN}"
RDEPENDS:${PPPN}-decode-perl += "file-listing-perl"
RDEPENDS:${PPPN}-decode-perl += "uri-perl"
RDEPENDS:${PPPN}-decode-perl += "html-parser-perl"
RDEPENDS:${PPPN}-decode-perl += "file-listing-ftpcopy-perl"
RDEPENDS:${PPPN}-decode-perl += "mojo-dom58-perl"
RDEPENDS:${PPPN}-decode-perl += "mojolicious-perl"

# RDEPENDS:${PPPN}-digest-perl += "${PN}"
# RDEPENDS:${PPPN}-digest-perl += "digest-sha-pureperl-perl"

RDEPENDS:${PPPN}-download-perl += "${PN}"

RDEPENDS:${PPPN}-extract-perl += "${PN}"
RDEPENDS:${PPPN}-extract-perl += "archive-zip-perl"
RDEPENDS:${PPPN}-extract-perl += "archive-tar-perl"
RDEPENDS:${PPPN}-extract-perl += "io-zlib-perl"
RDEPENDS:${PPPN}-extract-perl += "io-compress-perl"
RDEPENDS:${PPPN}-extract-perl += "io-compress-lzma-perl"

# RDEPENDS:${PPPN}-extract-commandline-perl += "${PPPN}-extract-perl"
# RDEPENDS:${PPPN}-extract-commandline-perl += "alien-gzip-perl"
# RDEPENDS:${PPPN}-extract-commandline-perl += "alien-libbz-perl"
# RDEPENDS:${PPPN}-extract-commandline-perl += "alien-unzip-perl"
# RDEPENDS:${PPPN}-extract-commandline-perl += "alien-xz-perl"

RDEPENDS:${PPPN}-extract-negotiate-perl += "${PPPN}-extract-commandline-perl"

RDEPENDS:${PPPN}-gather-perl += "${PN}"

RDEPENDS:${PPPN}-fetch-perl += "${PN}"
RDEPENDS:${PPPN}-fetch-perl += "uri-perl"
RDEPENDS:${PPPN}-fetch-perl += "http-tiny-perl"
RDEPENDS:${PPPN}-fetch-perl += "mozilla-ca-perl"
RDEPENDS:${PPPN}-fetch-perl += "libnet-perl"
RDEPENDS:${PPPN}-fetch-perl += "lwp-protocol-https-perl"
RDEPENDS:${PPPN}-fetch-perl += "libwww-perl-perl"
RDEPENDS:${PPPN}-fetch-perl += "curl"
RDEPENDS:${PPPN}-fetch-perl += "wget"

# RDEPENDS:${PPPN}-pkgconfig-perl += "${PN}"
# RDEPENDS:${PPPN}-pkgconfig-perl += "pkgconfig-libpkgconfig-perl"
# 
# RDEPENDS:${PPPN}-prefer-perl += "${PN}"
# RDEPENDS:${PPPN}-prefer-perl += "sort-versions-perl"
# 
# RDEPENDS:${PPPN}-probe-perl += "${PN}"
# RDEPENDS:${PPPN}-probe-perl += "extutils-cbuilder-perl"

RDEPENDS:${PPPN}-test-perl += "${PN}"

BBCLASSEXTEND = "native"
