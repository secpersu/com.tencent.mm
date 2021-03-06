package com.tencent.c.a.a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Locale;
import java.util.TimeZone;

final class b
{
  static a ajA;
  Integer ajB = null;
  String ajC = null;
  
  public b(Context paramContext)
  {
    try
    {
      P(paramContext);
      TelephonyManager localTelephonyManager = (TelephonyManager)paramContext.getSystemService("phone");
      if (localTelephonyManager != null) {
        ajB = Integer.valueOf(localTelephonyManager.getNetworkType());
      }
      ajC = s.ab(paramContext);
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  private static a P(Context paramContext)
  {
    try
    {
      if (ajA == null) {
        ajA = new a(paramContext.getApplicationContext(), (byte)0);
      }
      paramContext = ajA;
      return paramContext;
    }
    finally {}
  }
  
  static final class a
  {
    int Ro = 0;
    String ajD;
    String ajE = "2.21";
    DisplayMetrics ajF;
    int ajG = Build.VERSION.SDK_INT;
    String ajH = Build.MANUFACTURER;
    String ajI = Locale.getDefault().getLanguage();
    String ajJ = "WX";
    String ajK;
    String ajL;
    String ajM = null;
    String ajN = null;
    Context ctx = null;
    String imsi;
    String model = Build.MODEL;
    String packageName = null;
    String timezone;
    
    private a(Context paramContext)
    {
      ctx = paramContext.getApplicationContext();
      try
      {
        ajD = ctx.getPackageManager().getPackageInfo(ctx.getPackageName(), 0).versionName;
        ajF = new DisplayMetrics();
        ((WindowManager)ctx.getApplicationContext().getSystemService("window")).getDefaultDisplay().getMetrics(ajF);
        if (s.j(paramContext, "android.permission.READ_PHONE_STATE"))
        {
          paramContext = (TelephonyManager)paramContext.getSystemService("phone");
          if (paramContext != null)
          {
            ajK = paramContext.getSimOperator();
            imsi = paramContext.getSubscriberId();
          }
        }
        timezone = TimeZone.getDefault().getID();
        ajL = s.aa(ctx);
        packageName = ctx.getPackageName();
        ajN = s.kj();
        return;
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        for (;;) {}
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.tencent.c.a.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */