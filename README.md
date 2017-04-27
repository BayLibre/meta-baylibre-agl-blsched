# Baylibre's AGL blsched layer

This README file contains information on the contents of the
meta-baylibre-agl-blsched layer.

Please see the corresponding sections below for details.

### Dependencies
-------------------------

This layer depends on:

  * URI: https://gerrit.automotivelinux.org/gerrit/AGL/meta-renesas-rcar-gen3<br>
  layers: `meta-rcar-gen3`<br>
  tag: `master`

### Patches
-----------

Please submit any patches against the meta-baylibre-agl-chromium-test layer to the
the maintainers:

* Michael Turquette <mturquette@baylibre.com>
* Frode Isaksen <fisaksen@baylibre.com>
* Jerome Brunet <jbrunet@baylibre.com>

## I. Description and provided packages:

The layer provides bLsched utility. This package is an experimental utility to improve scheduling efficiency on big/LITTLE architecture.

+ Patched packages :
	- linux-renesas: Add configuration flags required for bLsched (PROC_EVENT and SCHED_DEBUG).
	- arm-trusted-firmware : export variable to get all CPU (please remember to flash it)
+ Provided packages :
	- bLSched : see https://github.com/BayLibre/bLsched/blob/master/README.md
	- bLsched-daemon : systemd service tailored for r8a7795 and r8a7796 SoCs

## II. Adding the meta-baylibre-agl-blsched layer to your AGL Chinook build

1. Download meta-baylibre-agl-blsched at `$AGL_TOP`
2. Add `blsched` to the feature of your AGL build<br>
```shell
source meta-agl/scripts/aglsetup.sh -m $MACHINE -b <your-other-features> blsched
```

With this `meta-baylibre-agl-blsched` will be added to your `conf/bblayers.conf`. `bLsched` and `blsched-daemon` will be appended to your image.
