DESCRIPTION = "Build and make available libffi"

SECTION = "libs"
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PACKAGE_NAME=	"Alien-FFI"
MAINTAINER=	"M4SS <edoardo.morandi@m4ss.net>"
HOMEPAGE=	"https://metacpan.org/dist/${PACKAGE_NAME}"

LIC_FILES_CHKSUM = "file://LICENSE;md5=7f7b6cc4aab12d0a8cb6a9ffefb49cfa"

BASE_SRC_URI = "https://cpan.metacpan.org/authors/id/P/PL/PLICEASE/${PACKAGE_NAME}"
SRC_URI[sha256sum] = "29bb2083f3f982a39f4852243f4f6a11916966f20e6e77864e99269d11e8b65e"

SRC_URI = "${BASE_SRC_URI}-${PV}.tar.gz"
S = "${WORKDIR}/${PACKAGE_NAME}-${PV}"

UPSTREAM_CHECK_URI = "${HOMEPAGE}"
UPSTREAM_CHECK_REGEX = "${BASE_SRC_URI}-(?P<pver>\d+(\.\d+){1,2})\.tar\.gz"

export BUILD_SYS

inherit cpan pkgconfig native

DEPENDS += "alien-build-perl-native"
DEPENDS += "alien-build-plugin-download-github-perl-native"

RDEPENDS:${PN} += "alien-build-perl"
