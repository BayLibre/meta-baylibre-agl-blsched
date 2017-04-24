FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}/cfg:"

SRC_URI_append = " \
	file://procevent.cfg \
	file://scheddebug.cfg \
	"
