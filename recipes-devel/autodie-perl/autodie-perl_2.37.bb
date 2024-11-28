DESCRIPTION = "Replace functions with ones that succeed or die with lexical scope"

SECTION = "libs"
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PACKAGE_NAME=	"autodie"
MAINTAINER=	"M4SS <edoardo.morandi@m4ss.net>"
HOMEPAGE=	"https://metacpan.org/dist/${PACKAGE_NAME}"

LIC_FILES_CHKSUM = "file://LICENSE;md5=a7254386216e6a41cf5772228d9f1d2d"

BASE_SRC_URI = "https://cpan.metacpan.org/authors/id/T/TO/TODDR/${PACKAGE_NAME}"
SRC_URI[sha256sum] = "4921d211b0cea63c2ca06dfc0c948a7203a3d48ad80a06f43b46104354f2c1c3"

SRC_URI = "${BASE_SRC_URI}-${PV}.tar.gz"
S = "${WORKDIR}/${PACKAGE_NAME}-${PV}"

UPSTREAM_CHECK_URI = "${HOMEPAGE}"
UPSTREAM_CHECK_REGEX = "${BASE_SRC_URI}-(?P<pver>\d+(\.\d+){1,2})\.tar\.gz"

inherit cpan allarch

RDEPENDS:${PN} += "carp-perl"
RDEPENDS:${PN} += "exporter-perl"
RDEPENDS:${PN} += "scalar-list-utils-perl"
RDEPENDS:${PN} += "tie-refhash-perl"
RDEPENDS:${PN} += "constant-perl"
RDEPENDS:${PN} += "parent-perl"

BBCLASSEXTEND = "native"
