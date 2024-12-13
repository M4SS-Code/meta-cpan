DESCRIPTION = "Find or build GNU Make"

SECTION = "libs"
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PACKAGE_NAME=	"Alien-gmake"
MAINTAINER=	"M4SS <edoardo.morandi@m4ss.net>"
HOMEPAGE=	"https://metacpan.org/dist/${PACKAGE_NAME}"

LIC_FILES_CHKSUM = "file://LICENSE;md5=7f7b6cc4aab12d0a8cb6a9ffefb49cfa"

BASE_SRC_URI = "https://cpan.metacpan.org/authors/id/P/PL/PLICEASE/${PACKAGE_NAME}"
SRC_URI[sha256sum] = "ac271c5ce8f506232acdf3c5aa71711bbcc1c459405e5471406a489b33e96b56"

SRC_URI = "${BASE_SRC_URI}-${PV}.tar.gz"
S = "${WORKDIR}/${PACKAGE_NAME}-${PV}"

UPSTREAM_CHECK_URI = "${HOMEPAGE}"
UPSTREAM_CHECK_REGEX = "${BASE_SRC_URI}-(?P<pver>\d+(\.\d+){1,2})\.tar\.gz"

inherit cpan allarch

DEPENDS += "alien-build-perl-native"
DEPENDS += "capture-tiny-perl-native"
DEPENDS += "file-chdir-perl-native"

RDEPENDS:${PN} += "alien-build-perl"

BBCLASSEXTEND = "native"
