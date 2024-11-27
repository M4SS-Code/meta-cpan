DESCRIPTION = "This module provides a simple but complete cron like \
scheduler. I.e this modules can be used for periodically executing Perl \
subroutines. The dates and parameters for the subroutines to be called are \
specified with a format known as crontab entry (see manpage crontab(5) or \
documentation of Schedule::Cron)."

SECTION = "libs"
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PACKAGE_NAME=	"Schedule-Cron"
MAINTAINER=	"M4SS <edoardo.morandi@m4ss.net>"
HOMEPAGE=	"https://metacpan.org/dist/${PACKAGE_NAME}"

LIC_FILES_CHKSUM = "\
    file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
    file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61 \
"

BASE_SRC_URI = "https://cpan.metacpan.org/authors/id/N/NH/NHUBBARD/${PACKAGE_NAME}"
SRC_URI[sha256sum] = "39eb333f823f693ba8cd31a566f3857eeefda20891d8e79999c82d37453df462"

SRC_URI = "${BASE_SRC_URI}-${PV}.tar.gz"
S = "${WORKDIR}/${PACKAGE_NAME}-${PV}"

UPSTREAM_CHECK_URI = "${HOMEPAGE}"
UPSTREAM_CHECK_REGEX = "${BASE_SRC_URI}-(?P<pver>\d+(\.\d+){1,2})\.tar\.gz"

inherit cpan allarch

RDEPENDS:${PN} += "data-dumper-perl"
RDEPENDS:${PN} += "time-parsedate-perl"

BBCLASSEXTEND = "native"
