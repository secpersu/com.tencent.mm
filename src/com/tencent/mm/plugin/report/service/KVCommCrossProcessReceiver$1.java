package com.tencent.mm.plugin.report.service;

import android.os.Process;
import com.tencent.mm.protocal.c;
import com.tencent.mm.sdk.platformtools.u;
import com.tencent.mm.sdk.platformtools.y;

final class KVCommCrossProcessReceiver$1
  implements Runnable
{
  KVCommCrossProcessReceiver$1(KVCommCrossProcessReceiver paramKVCommCrossProcessReceiver) {}
  
  public final void run()
  {
    if (c.cX(y.getContext()))
    {
      u.e("!44@/B4Tb64lLpJlEqDd0Ubo4Jxu+CyGfot/sNGdExUpV40=", "KVCommCrossProcessReceiver shut_down_weixin need to kill process");
      u.appenderFlushSync();
      KVReportJni.KVReportJava2C.onExitAppOrAppCrash();
      Process.killProcess(Process.myPid());
    }
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */