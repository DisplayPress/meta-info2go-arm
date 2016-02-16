# Copyright (C) 2015=2016 Info2Go

DESCRIPTION = "U-Boot provided by Info2Go for amherst boards."

require recipes-bsp/u-boot/u-boot.inc

PROVIDES += "u-boot"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/gpl-2.0.txt;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRCBRANCH = "info2go-imx_v2015.04_3.14.38_6qp_ga"
SRCREV = "be15afd3989d41ceec866de5291fb35ab9d48a7c"

SRC_URI = "git://github.com/displaypress/uboot-imx6.git;protocol=git;branch=${SRCBRANCH}"

S = "${WORKDIR}/git"

inherit fsl-u-boot-localversion

LOCALVERSION ?= "-${SRCBRANCH}"

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(amherst-quad)"
