Daimler SGP Device Policy Control (DPC) App
=========================================

SGP DPC is an app designed to control devices in a Android enterprise managed profile (i.e. work profile). It serves as both a sample Device Policy Controller and a testing application to flex the APIs available for Android enterprise. It supports devices running Android 5.0 Lollipop or later.

See the [documentation](https://developer.android.com/work/index.html) to learn more about Android in the enterprise.

Provisioning
------------

You can find various kinds of provisioning methods [here](https://developers.google.com/android/work/prov-devices#Key_provisioning_differences_across_android_releases). Let's take a few of them as an example.

#### QR code provisioing (Device Owner N+ only) ####
1. Factory reset your device and tap the welcome screen in setup wizard 6 times.
2. The setup wizard prompts the user to connect to the Internet so the setup wizard can download a QR code reader.
3. Modify (if needed) and scan [this QR code] (http://google.com).
4. Follow onscreen instructions

#### NFC provisioning (Device Owner) ####
The [NFC Provisioning app](https://github.com/googlesamples/android-NfcProvisioning) is used for *device owner* provisioning.
1. Push the nfcprovisioning.txt file to your device:
`adb push nfcprovisioning.txt /sdcard/`
2. Open the NFC Provisioning app and ensure that com.daimler.testdpc is auto-populated.
3. Bump the devices and touch to beam.
4. Follow onscreen instructions on the target device.

#### adb command (Device Owner) ####
adb shell dpm set-device-owner com.daimler.testdpc/.DeviceAdminReceiver

Screenshots
------------

< img src="doc/setup.png" height="400" alt="Setup" title="Setup screen"/>
< img src="doc/policy_management.png" height="400" alt="Policy Management" title="Home screen once the profile is setup" />
< img src="doc/manage_app_restrictions.png" height="400" alt="Manage App Restrictions" title="Manage restrictions for apps in the work profile" />
< img src="doc/work_profile_management.png" height="400" alt="Work Profile Management" title="Manage policies specific to the work profile" />
< img src="doc/network_data_usage_stats.png" height="400" alt="Network Data Usage Stats" title="Analyze data usage for specific work apps or the entire profile" />

