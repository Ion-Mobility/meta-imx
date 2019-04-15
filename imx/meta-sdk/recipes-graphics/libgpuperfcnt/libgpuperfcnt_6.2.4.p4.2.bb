DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=80c0478f4339af024519b3723023fe28" 

SRC_URI[arm-fb.md5sum] = "ab2d2010417eb9a77a67d2f4340bd57c"
SRC_URI[arm-fb.sha256sum] = "ad85c6a5e60b4e377e0ad21907340c10a67e8f7cfc2c2f097be83e1e4370b699"

SRC_URI[arm-wayland.md5sum] = "68ad3f3ea16728615256a9198d694b85"
SRC_URI[arm-wayland.sha256sum] = "c78be38f845964dd26ec7fb1a462ab4e86813a2682580ab24bb3afd11eff77c2"

SRC_URI[arm-x11.md5sum] = "f7d30829106c035e91df631395614598"
SRC_URI[arm-x11.sha256sum] = "cf3df50c57e2982dedb3e5890b8489e49fa901964088f52c6c9428599606e1cb"

SRC_URI[aarch64-fb.md5sum] = "55f55c2d754f7f244e765e0d07101749"
SRC_URI[aarch64-fb.sha256sum] = "318e96536651e356af8f74a554cb0b54932c6d3111803483ff096f5fd5fc209d"

SRC_URI[aarch64-wayland.md5sum] = "b6a3158289e327d1744bdc97809defa7"
SRC_URI[aarch64-wayland.sha256sum] = "3d0112214c40639e83cd613fe0dfb882b51b8ff40c98e8146b4b27e2c47390e9"

SRC_URI[aarch64-x11.md5sum] = "ccd23c0d474f39d39300149564a4b316"
SRC_URI[aarch64-x11.sha256sum] = "f2b30e562b6e6067f20eadf4a5cc3434cf09640d9368a5e996eb5e9d937d8d2d"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
