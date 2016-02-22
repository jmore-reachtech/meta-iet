DESCRIPTION = "Tool for sending pcap files over ethernet."
SECTION = "base"
DEPENDS = "libpcap"
HOMEPAGE = "http://bittwist.sourceforge.net/"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=73c160f3cb55ce366300509ca6a604f0"

SRC_URI = "${SOURCEFORGE_MIRROR}/${PN}/${PN}-linux-${PV}.tar.gz"

SRC_URI[md5sum] = "8a93e0ae5df3172dabf154ccfd31c49f"
SRC_URI[sha256sum] = "7b98123d2bcb9bec59dc5e610c0c5b5749ef2ed83418956c3ddef3cf5824ea45"

S = "${WORKDIR}/${PN}-linux-${PV}"

SRC="${S}/src"

do_compile () {
    ${CC} ${SRC}/bittwist.c -o ${SRC}/bittwist -lpcap
    ${CC} ${SRC}/bittwiste.c -o ${SRC}/bittwiste -lpcap

}

do_install () {
    mkdir -p ${D}${bindir}
    install -m 0755 ${SRC}/bittwist ${D}${bindir}
    install -m 0755 ${SRC}/bittwiste ${D}${bindir}
}
