DESCRIPTION = "Parse directory listing using ftpparse from ftpcopy"

SECTION = "libs"
LICENSE = "GPL-2.0-or-later"

PACKAGE_NAME=	"File-Listing-Ftpcopy"
MAINTAINER=	"M4SS <edoardo.morandi@m4ss.net>"
HOMEPAGE=	"https://metacpan.org/dist/${PACKAGE_NAME}"

LIC_FILES_CHKSUM = "file://LICENSE;md5=8a79d70b5e3317c6440e43d583832025"

BASE_SRC_URI = "https://cpan.metacpan.org/authors/id/P/PL/PLICEASE/${PACKAGE_NAME}"
SRC_URI[sha256sum] = "721ce166e1dc178cf350c218db109d874a86143b319207809474662e50e2fc47"

SRC_URI = "\
    ${BASE_SRC_URI}-${PV}.tar.gz \
    file://0001-use-build-flags-when-detecting-ct-features.patch \
"
S = "${WORKDIR}/${PACKAGE_NAME}-${PV}"

UPSTREAM_CHECK_URI = "${HOMEPAGE}"
UPSTREAM_CHECK_REGEX = "${BASE_SRC_URI}-(?P<pver>\d+(\.\d+){1,2})\.tar\.gz"

inherit cpan_build

DEPENDS += "module-build-perl-native"
DEPENDS += "autodie-perl-native"

RDEPENDS:${PN} += "math-int64-perl"

# TODO: find a way to make the Module::Build happy, because it does not work in native mode
# BBCLASSEXTEND = "native"
