package com.whatsapp;

import X.AnonymousClass1AV;
import X.AnonymousClass1DC;
import X.AnonymousClass1GW;
import X.AnonymousClass5V4;
import X.C1041958q;
import X.C18740tg;
import X.C24341Cb;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Mp4Ops {
    public final C24341Cb A00;

    public static void A01(AnonymousClass1AV r13, File file, File file2) {
        Throwable r1;
        C1041958q A02 = r13.A02(file, file);
        try {
            Log.i("mp4ops/removeExifData/start");
            LibMp4OperationResult mp4mux = mp4mux(file.getAbsolutePath(), file.getAbsolutePath(), file2.getAbsolutePath(), -1.0f, 0.0f, -1.0f, -1.0f, -1, file.getAbsolutePath(), 0.0f);
            StringBuilder sb = new StringBuilder();
            sb.append("mp4ops/removeExifData/finished success=");
            sb.append(mp4mux.success);
            Log.i(sb.toString());
            r13.A04(mp4mux, A02, file2);
            if (A02 != null) {
                r13.A01.Bly(A02);
            }
            if (!mp4mux.success) {
                if (mp4mux.ioException) {
                    r1 = new IOException("mp4ops/removeExifData/No space");
                } else {
                    int i = mp4mux.errorCode;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("mp4ops/removeExifData failed, error_code: ");
                    sb2.append(i);
                    sb2.append(" | message: ");
                    sb2.append(mp4mux.errorMessage);
                    r1 = new AnonymousClass5V4(i, sb2.toString());
                }
                throw r1;
            }
        } catch (Error e) {
            Log.e("mp4ops/removeExifData/failed: mp4mux error, exiting", e);
            throw new AnonymousClass5V4(0, e.getMessage());
        }
    }

    public static native int getMp4opsImpl();

    public static native LibMp4OperationResult mp4check(String str, boolean z);

    public static native LibMp4CheckAndRepairResult mp4checkAndRepair(String str, String str2);

    public static native LibMp4OperationResult mp4mux(String str, String str2, String str3, float f, float f2, float f3, float f4, int i, String str4, float f5);

    public static native LibMp4OperationResult mp4removeDolbyEAC3Track(String str, String str2);

    public static native LibMp4StreamCheckResult mp4streamcheck(String str, boolean z, long j);

    public static native LibMp4OperationResult removeAudioTracks(String str, String str2);

    public class AudioStreamInfo {
        public final int averageBitrateKbps;
        public final long durationMs;
        public final int mpegAudioObjectType;
        public final int mpegAudioToolsPresent;
        public final int numChannels;
        public final int samplingRate;
        public final int subType;
        public final int trackId;
        public final int type;

        public AudioStreamInfo(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j) {
            this.trackId = i;
            this.type = i2;
            this.subType = i3;
            this.mpegAudioObjectType = i4;
            this.mpegAudioToolsPresent = i5;
            this.numChannels = i6;
            this.samplingRate = i7;
            this.averageBitrateKbps = i8;
            this.durationMs = j;
        }
    }

    public class LibMp4CheckAndRepairResult {
        public final AudioStreamInfo asi;
        public final int errorCode;
        public final String errorMessage;
        public final boolean ioException;
        public final long newMajorVersion;
        public final long newMinorVersion;
        public final int newOriginator;
        public final long newReleaseVersion;
        public final long oldMajorVersion;
        public final long oldMinorVersion;
        public final int oldOriginator;
        public final long oldReleaseVersion;
        public final boolean repairRequired;
        public final boolean repaired;
        public final boolean success;
        public final VideoStreamInfo vsi;

        public LibMp4CheckAndRepairResult(boolean z, boolean z2, boolean z3, int i, String str, boolean z4, AudioStreamInfo audioStreamInfo, VideoStreamInfo videoStreamInfo, long j, long j2, long j3, int i2, long j4, long j5, long j6, int i3) {
            this.success = z;
            this.repaired = z2;
            this.repairRequired = z3;
            this.errorCode = i;
            this.errorMessage = str;
            this.ioException = z4;
            this.asi = audioStreamInfo;
            this.vsi = videoStreamInfo;
            this.oldMajorVersion = j;
            this.oldMinorVersion = j2;
            this.oldReleaseVersion = j3;
            this.oldOriginator = i2;
            this.newMajorVersion = j4;
            this.newMinorVersion = j5;
            this.newReleaseVersion = j6;
            this.newOriginator = i3;
        }
    }

    public class LibMp4OperationResult {
        public final AudioStreamInfo asi;
        public final int errorCode;
        public final String errorMessage;
        public final boolean ioException;
        public final boolean success;
        public final VideoStreamInfo vsi;

        public LibMp4OperationResult(boolean z, boolean z2, int i, AudioStreamInfo audioStreamInfo, VideoStreamInfo videoStreamInfo, String str) {
            this.success = z;
            this.ioException = z2;
            this.errorCode = i;
            this.asi = audioStreamInfo;
            this.vsi = videoStreamInfo;
            this.errorMessage = str;
        }
    }

    public class LibMp4StreamCheckResult {
        public final long bytesRequiredToExtractThumbnail;
        public final int errorCode;
        public final String errorMessage;
        public final boolean ioException;
        public final boolean success;

        public LibMp4StreamCheckResult(boolean z, boolean z2, int i, String str, long j) {
            this.success = z;
            this.ioException = z2;
            this.errorCode = i;
            this.errorMessage = str;
            this.bytesRequiredToExtractThumbnail = j;
        }
    }

    public class VideoStreamInfo {
        public final int averageBitrateKbps;
        public final long durationMs;
        public final int framesPerKseconds;
        public final int height;
        public final int levelIdc;
        public final int profileIdc;
        public final int rotationDegrees;
        public final int trackId;
        public final int type;
        public final int width;

        public VideoStreamInfo(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, long j) {
            this.trackId = i;
            this.type = i2;
            this.profileIdc = i3;
            this.levelIdc = i4;
            this.rotationDegrees = i5;
            this.width = i6;
            this.height = i7;
            this.framesPerKseconds = i8;
            this.averageBitrateKbps = i9;
            this.durationMs = j;
        }
    }

    public static void A00(AnonymousClass1AV r7, C24341Cb r8, File file) {
        AnonymousClass5V4 r0;
        try {
            if (AnonymousClass1DC.A04(file).A00 != 0) {
                File A01 = r8.A01(file);
                C1041958q A03 = r7.A03(file, A01);
                LibMp4OperationResult removeAudioTracks = removeAudioTracks(file.getAbsolutePath(), A01.getAbsolutePath());
                r7.A04(removeAudioTracks, A03, A01);
                if (A03 != null) {
                    r7.A01.Bly(A03);
                }
                if (!removeAudioTracks.success) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("mp4ops/remove-audio-tracks");
                    sb.append(removeAudioTracks.errorMessage);
                    Log.e(sb.toString());
                    int i = removeAudioTracks.errorCode;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("invalid result, error_code: ");
                    sb2.append(i);
                    sb2.append(" | message: ");
                    sb2.append(removeAudioTracks.errorMessage);
                    r0 = new AnonymousClass5V4(i, sb2.toString());
                } else if (!AnonymousClass1GW.A0S(r8, A01, file)) {
                    Log.e("mp4ops/remove-audio-tracks failed to apply tag properly.  Renaming marked file to original filepath unsuccessful");
                    r0 = new AnonymousClass5V4(0, "mp4ops/remove-audio-tracks failed to apply tag properly.  Renaming marked file to original filepath unsuccessful");
                } else {
                    return;
                }
                throw r0;
            }
        } catch (IOException e) {
            Log.e("Could not access file or failed to move files properly", e);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Could not access file or failed to move files properly: ");
            sb3.append(e.getMessage());
            throw new AnonymousClass5V4(0, sb3.toString());
        }
    }

    public static void A02(AnonymousClass1AV r14, File file, File file2, File file3, File file4, int i, long j, long j2, long j3, long j4) {
        String absolutePath;
        Log.i("mp4ops/mux/start");
        File file5 = file3;
        File file6 = file2;
        AnonymousClass1AV r4 = r14;
        C1041958q A02 = r14.A02(file6, file5);
        float f = ((float) j) / 1000.0f;
        float f2 = ((float) j4) / 1000.0f;
        float f3 = ((float) j3) / 1000.0f;
        float f4 = ((float) j2) / 1000.0f;
        String str = "";
        if (file2 == null) {
            absolutePath = str;
        } else {
            try {
                absolutePath = file6.getAbsolutePath();
            } catch (Error e) {
                Log.e("mp4ops/mux/failed: mp4mux error, exiting", e);
                throw new AnonymousClass5V4(0, e.getMessage());
            }
        }
        if (file3 != null) {
            str = file5.getAbsolutePath();
        }
        File file7 = file;
        LibMp4OperationResult mp4mux = mp4mux(absolutePath, str, file.getAbsolutePath(), f, 0.0f, f3, f4, i, file4.getAbsolutePath(), f2);
        StringBuilder sb = new StringBuilder();
        sb.append("mp4ops/mux/result: ");
        sb.append(mp4mux.success);
        Log.i(sb.toString());
        r4.A04(mp4mux, A02, file7);
        if (A02 != null) {
            r4.A01.Bly(A02);
        }
        if (!mp4mux.success) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("mp4ops/mux/error_message/");
            sb2.append(mp4mux.errorMessage);
            Log.e(sb2.toString());
            if (mp4mux.ioException) {
                throw new IOException("No space");
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("invalid result, error_code: ");
            int i2 = mp4mux.errorCode;
            sb3.append(i2);
            sb3.append(" | message: ");
            sb3.append(mp4mux.errorMessage);
            throw new AnonymousClass5V4(i2, sb3.toString());
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("mp4ops/mux/finished, size:");
        sb4.append(file7.length());
        Log.i(sb4.toString());
    }

    public static void A03(AnonymousClass1AV r7, File file, boolean z) {
        LibMp4OperationResult mp4check;
        Log.i("mp4ops/check/start");
        C1041958q A002 = AnonymousClass1AV.A00(r7, file, 0, z);
        int i = 0;
        do {
            try {
                mp4check = mp4check(file.getAbsolutePath(), z);
                if (mp4check.success || !mp4check.ioException) {
                    C18740tg.A06(mp4check);
                    r7.A04(mp4check, A002, (File) null);
                } else {
                    SystemClock.sleep(100);
                    i++;
                }
            } catch (Error e) {
                Log.e("mp4ops/integration fail/", e);
                StringBuilder sb = new StringBuilder();
                sb.append("integrity check error: ");
                sb.append(e.getMessage());
                throw new AnonymousClass5V4(0, sb.toString());
            }
        } while (i < 5);
        C18740tg.A06(mp4check);
        r7.A04(mp4check, A002, (File) null);
        if (A002 != null) {
            r7.A01.Bly(A002);
        }
        if (mp4check.success) {
            Log.i("mp4ops/check/finished");
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("mp4ops/check/error_message/");
        sb2.append(mp4check.errorMessage);
        Log.e(sb2.toString());
        int i2 = mp4check.errorCode;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("integrity check failed, error_code: ");
        sb3.append(i2);
        sb3.append(" | message:");
        sb3.append(mp4check.errorMessage);
        throw new AnonymousClass5V4(i2, sb3.toString());
    }

    public boolean A04(AnonymousClass1AV r11, File file) {
        Log.i("mp4ops/checkAndRepair/start");
        C1041958q A002 = AnonymousClass1AV.A00(r11, file, 3, false);
        C24341Cb r5 = this.A00;
        File A01 = r5.A01(file);
        StringBuilder sb = new StringBuilder();
        sb.append("mp4ops/checkAndRepair/repairFileName.exists");
        sb.append(A01.exists());
        Log.i(sb.toString());
        try {
            LibMp4CheckAndRepairResult mp4checkAndRepair = mp4checkAndRepair(file.getAbsolutePath(), A01.getAbsolutePath());
            if (A002 != null) {
                Long l = A002.A0E;
                if (l != null) {
                    A002.A0E = Long.valueOf(System.nanoTime() - l.longValue());
                }
                A002.A0D = Long.valueOf((long) mp4checkAndRepair.errorCode);
                A002.A0C = Long.valueOf(A01.length());
                AudioStreamInfo audioStreamInfo = mp4checkAndRepair.asi;
                if (audioStreamInfo != null) {
                    A002.A06 = Long.valueOf((long) audioStreamInfo.averageBitrateKbps);
                    A002.A07 = Long.valueOf((long) audioStreamInfo.numChannels);
                    A002.A08 = Long.valueOf((long) audioStreamInfo.samplingRate);
                    A002.A00 = Integer.valueOf(audioStreamInfo.subType);
                    A002.A09 = 1L;
                    A002.A01 = Integer.valueOf(audioStreamInfo.type);
                }
                VideoStreamInfo videoStreamInfo = mp4checkAndRepair.vsi;
                if (videoStreamInfo != null) {
                    A002.A0F = Long.valueOf((long) videoStreamInfo.averageBitrateKbps);
                    A002.A0G = Long.valueOf((long) videoStreamInfo.framesPerKseconds);
                    A002.A0H = Long.valueOf((long) videoStreamInfo.height);
                    A002.A0I = Long.valueOf((long) videoStreamInfo.levelIdc);
                    A002.A0J = Long.valueOf((long) videoStreamInfo.profileIdc);
                    A002.A0K = Long.valueOf((long) videoStreamInfo.rotationDegrees);
                    A002.A0L = 2L;
                    A002.A05 = Integer.valueOf(videoStreamInfo.type);
                    A002.A0M = Long.valueOf((long) videoStreamInfo.width);
                }
                r11.A01.Bly(A002);
            }
            if (!mp4checkAndRepair.success) {
                if (mp4checkAndRepair.repaired) {
                    A01.delete();
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("mp4ops/checkAndRepair/error_message/");
                sb2.append(mp4checkAndRepair.errorMessage);
                Log.e(sb2.toString());
                if (mp4checkAndRepair.ioException) {
                    throw new IOException("No space");
                }
                int i = mp4checkAndRepair.errorCode;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("integrity check/repair failed, error_code: ");
                sb3.append(i);
                sb3.append(" | message: ");
                sb3.append(mp4checkAndRepair.errorMessage);
                throw new AnonymousClass5V4(i, sb3.toString());
            }
            Log.i("mp4ops/checkAndRepair/finished");
            if (mp4checkAndRepair.repaired) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("mp4ops/checkAndRepair/file_is_repaired, new file created and renamed: ");
                sb4.append(A01.getAbsolutePath());
                Log.i(sb4.toString());
                A01(r11, A01, file);
                return true;
            }
            Log.i("mp4ops/checkAndRepair/file_repair_not_needed but will remove exif data");
            File A012 = r5.A01(file);
            A01(r11, file, A012);
            if (file.length() == A012.length()) {
                return false;
            }
            if (A012.renameTo(file)) {
                return true;
            }
            Log.i("mp4ops/checkAndRepair/rename_failed");
            throw new IOException("unable to rename file");
        } catch (Error e) {
            Log.e("mp4ops/integration fail/", e);
            if (e.getCause() instanceof FileNotFoundException) {
                throw e;
            }
            StringBuilder sb5 = new StringBuilder();
            sb5.append("integrity check error: ");
            sb5.append(e.getMessage());
            throw new AnonymousClass5V4(0, sb5.toString());
        }
    }

    public Mp4Ops(C24341Cb r1) {
        this.A00 = r1;
    }
}
