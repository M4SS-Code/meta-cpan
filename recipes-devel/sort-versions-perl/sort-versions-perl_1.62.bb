DESCRIPTION = "A perl 5 module for sorting of revision-like numbers"

SECTION = "libs"
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PACKAGE_NAME=	"Sort-Versions"
MAINTAINER=	"M4SS <edoardo.morandi@m4ss.net>"
HOMEPAGE=	"https://metacpan.org/dist/${PACKAGE_NAME}"

LIC_FILES_CHKSUM = "file://LICENSE;md5=353ffda9d94b91b1538bc611db80e166"

BASE_SRC_URI = "https://cpan.metacpan.org/authors/id/N/NE/NEILB/${PACKAGE_NAME}"
SRC_URI[sha256sum] = "bf5f3307406ebe2581237f025982e8c84f6f6625dd774e457c03f8994efd2eaa"

SRC_URI = "${BASE_SRC_URI}-${PV}.tar.gz"
S = "${WORKDIR}/${PACKAGE_NAME}-${PV}"

UPSTREAM_CHECK_URI = "${HOMEPAGE}"
UPSTREAM_CHECK_REGEX = "${BASE_SRC_URI}-(?P<pver>\d+(\.\d+){1,2})\.tar\.gz"

inherit cpan allarch

RDEPENDS:${PN} += "exporter-perl"

BBCLASSEXTEND = "native"
