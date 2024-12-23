DESCRIPTION = "MySQL driver for the Perl5 Database Interface (DBI)"

SECTION = "libs"
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PACKAGE_NAME=	"DBD-mysql"
MAINTAINER=	"M4SS <edoardo.morandi@m4ss.net>"
HOMEPAGE=	"https://metacpan.org/dist/${PACKAGE_NAME}"

LIC_FILES_CHKSUM = "file://LICENSE;md5=d0a06964340e5c0cde88b7af611f755c"

BASE_SRC_URI = "https://cpan.metacpan.org/authors/id/D/DV/DVEEDEN/${PACKAGE_NAME}"
SRC_URI[sha256sum] = "16969bfae7a080384167be3fb1803450fde87f7b0e2682276b3f6469fa147864"

SRC_URI = "\
    ${BASE_SRC_URI}-${PV}.tar.gz \
    file://0001-fix-compilation.patch \
"
S = "${WORKDIR}/${PACKAGE_NAME}-${PV}"

UPSTREAM_CHECK_URI = "${HOMEPAGE}"
UPSTREAM_CHECK_REGEX = "${BASE_SRC_URI}-(?P<pver>\d+(\.\d+){1,2})\.tar\.gz"

EXTRA_CPAN_FLAGS="--config cc='${BUILD_CC}' --config ccflags='${BUILD_CFLAGS}' --config ld='${BUILD_CCLD} ${BUILD_LDFLAGS}'"

inherit cpan

DEPENDS += "libdbi-perl-native"
DEPENDS += "data-dumper-perl-native"
DEPENDS += "devel-checklib-perl-native"
DEPENDS += "mariadb"

RDEPENDS:${PN} += "libdbi-perl"
RDEPENDS:${PN} += "mariadb"

BBCLASSEXTEND = "native"
