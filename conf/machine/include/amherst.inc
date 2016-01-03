#Common settings for Info2Go amherst boards

include conf/machine/include/imx-base.inc
include conf/machine/include/tune-cortexa9.inc

PREFERRED_PROVIDER_virtual/kernel ?= "linux-amherst"
PREFERRED_VERSION_linux-amherst ?= "3.14.28"

SERIAL_CONSOLE = "115200 ttymxc0"

MACHINE_FEATURES += "pci wifi bluetooth touchscreen"

KERNEL_IMAGETYPE = "zImage"
