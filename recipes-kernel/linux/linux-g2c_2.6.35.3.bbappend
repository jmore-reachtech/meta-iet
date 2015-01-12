# Append path for reach layer to include kernel defconfig 
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

PRINC := "${@int(PRINC) + 2}"

SRC_URI += "file://0001-update-kernel-boot-logo.patch \
"
