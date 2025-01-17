DESCRIPTION = "This module is an interface to libxml2, providing XML and HTML parsers with \
DOM, SAX and XMLReader interfaces, a large subset of DOM Layer 3 interface \
and a XML::XPath-like interface to XPath API of libxml2. The module is \
split into several packages which are not described in this section; unless \
stated otherwise, you only need to "use XML::LibXML;" in your programs."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/XML-LibXML"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/S/SH/SHLOMIF/XML-LibXML-${PV}.tar.gz"

SRC_URI[md5sum] = "d2bad7f395716a6f57abde538d47008c"
SRC_URI[sha256sum] = "a29bf3f00ab9c9ee04218154e0afc8f799bf23674eb99c1a9ed4de1f4059a48d"
DEPENDS += "libxml2"
DEPENDS += "libxml-sax-perl-native"
DEPENDS += "zlib"
DEPENDS += "alien-build-perl-native"
DEPENDS += "alien-libxml2-perl-native"
RDEPENDS:${PN} += "libxml2"
RDEPENDS:${PN} += "perl-module-carp"
RDEPENDS:${PN} += "perl-module-dynaloader"
RDEPENDS:${PN} += "perl-module-encode"
RDEPENDS:${PN} += "perl-module-exporter"
RDEPENDS:${PN} += "perl-module-io-handle"
RDEPENDS:${PN} += "perl-module-scalar-util"
RDEPENDS:${PN} += "perl-module-tie-hash"
RDEPENDS:${PN} += "xml-namespacesupport-perl"
RDEPENDS:${PN} += "xml-sax-perl"
RDEPENDS:${PN} += "xml-sax-base-perl"
RDEPENDS:${PN} += "perl-module-base"
RDEPENDS:${PN} += "perl-module-constant"
RDEPENDS:${PN} += "perl-module-overload"
RDEPENDS:${PN} += "perl-module-parent"
RDEPENDS:${PN} += "perl-module-strict"
RDEPENDS:${PN} += "perl-module-vars"
RDEPENDS:${PN} += "perl-module-warnings"

S = "${WORKDIR}/XML-LibXML-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
