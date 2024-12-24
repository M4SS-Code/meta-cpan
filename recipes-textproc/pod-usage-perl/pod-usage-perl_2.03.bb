DESCRIPTION = "Extracts POD documentation and shows usage information"

SECTION = "libs"
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PACKAGE_NAME=	"Pod-Usage"
MAINTAINER=	"M4SS <edoardo.morandi@m4ss.net>"
HOMEPAGE=	"https://metacpan.org/dist/${PACKAGE_NAME}"

LIC_FILES_CHKSUM = "file://LICENSE;md5=b580c373bd8f0e6932cc0819e0cd5d41"

BASE_SRC_URI = "https://cpan.metacpan.org/authors/id/M/MA/MAREKR/${PACKAGE_NAME}"
SRC_URI[sha256sum] = "7d8fdc7dce60087b6cf9e493b8d6ae84a5ab4c0608a806a6d395cc6557460744"

SRC_URI = "${BASE_SRC_URI}-${PV}.tar.gz"
S = "${WORKDIR}/${PACKAGE_NAME}-${PV}"

UPSTREAM_CHECK_URI = "${HOMEPAGE}"
UPSTREAM_CHECK_REGEX = "${BASE_SRC_URI}-(?P<pver>\d+(\.\d+){1,2})\.tar\.gz"

inherit cpan allarch

RDEPENDS:${PN} += "pathtools-perl"
RDEPENDS:${PN} += "pod-perldoc-perl"
RDEPENDS:${PN} += "pod-simple-perl"
RDEPENDS:${PN} += "podlators-perl"

BBCLASSEXTEND = "native"
