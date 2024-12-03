DESCRIPTION = "Minimalistic HTML/XML DOM parser with CSS selectors"

SECTION = "libs"
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PACKAGE_NAME=	"Mojo-DOM58"
MAINTAINER=	"M4SS <edoardo.morandi@m4ss.net>"
HOMEPAGE=	"https://metacpan.org/dist/${PACKAGE_NAME}"

LIC_FILES_CHKSUM = "file://LICENSE;md5=5b2990998bc2a90c6309f190be0d3b68"

BASE_SRC_URI = "https://cpan.metacpan.org/authors/id/D/DB/DBOOK/${PACKAGE_NAME}"
SRC_URI[sha256sum] = "18b26d541e5314415adddf314369d940c8ba06b11234ca506fdbe6cf224f5796"

SRC_URI = "${BASE_SRC_URI}-${PV}.tar.gz"
S = "${WORKDIR}/${PACKAGE_NAME}-${PV}"

UPSTREAM_CHECK_URI = "${HOMEPAGE}"
UPSTREAM_CHECK_REGEX = "${BASE_SRC_URI}-(?P<pver>\d+(\.\d+){1,2})\.tar\.gz"

inherit cpan allarch

RDEPENDS:${PN} += "carp-perl"
RDEPENDS:${PN} += "data-dumper-perl"
RDEPENDS:${PN} += "exporter-perl"
RDEPENDS:${PN} += "scalar-list-utils-perl"
RDEPENDS:${PN} += "constant-perl"

BBCLASSEXTEND = "native"
