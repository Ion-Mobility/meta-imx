DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=5ab1a30d0cd181e3408077727ea5a2db"

SRC_URI[arm-fb.md5sum] = "23288fe13b095497db4eb34e37a3445f"
SRC_URI[arm-fb.sha256sum] = "b2f0feb2a559048098cfb04a1c32cadf97c67469868a94604f3480426b24e3b2"

SRC_URI[arm-wayland.md5sum] = "37460a64b432ba151d23ac21379d98b1"
SRC_URI[arm-wayland.sha256sum] = "7a7cbd7403f0d122c11d91a4159c4d90b1ffc8deafb81189d5a997fb34ebfdd8"

SRC_URI[arm-x11.md5sum] = "2d3f7496edf89b1f851a195867febddd"
SRC_URI[arm-x11.sha256sum] = "01fe078630cd0b86e076234e0e97d2aaef8861832c6095dfca70770ccdbb976f"

SRC_URI[aarch64-fb.md5sum] = "fdbbf9912664dd51f4fcee428364ce19"
SRC_URI[aarch64-fb.sha256sum] = "8d92f26c7b8fbabcf32854ebfa3900019624daad05742b0cfb86b2fbc0e0b9cf"

SRC_URI[aarch64-wayland.md5sum] = "b63b0a0a675c7d82d347d6ce8fa062b4"
SRC_URI[aarch64-wayland.sha256sum] = "545cab1a8a0d3de3d7f4a889d61805a0965263b3ea1a686a81706b0a845e8e2f"

SRC_URI[aarch64-x11.md5sum] = "23057f7807545102fc94f085115a1b5f"
SRC_URI[aarch64-x11.sha256sum] = "90298f80ffd3f17cacd50f6bdd641293e1dad6176fbbb5b276ee181674558fed"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
