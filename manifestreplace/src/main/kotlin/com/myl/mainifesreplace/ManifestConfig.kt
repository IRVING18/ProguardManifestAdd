package com.myl.mainifesreplace

open class ManifestConfig {
    var enable: Boolean = true
    var activityCount: Int = 0
    var providerCount: Int = 0
    var serviceCount: Int = 0
    var receiverCount: Int = 0
    var prefix: String = ""

    override fun toString(): String {
        return "ManifestConfig\n" +
                "\tenable=$enable" +
                "\tactivityCount=$activityCount" +
                "\tproviderCount=$providerCount\n" +
                "\tserviceCount=$serviceCount\n" +
                "\tprefix=$prefix\n" +
                "\treceiverCount=$receiverCount\n"
    }
}