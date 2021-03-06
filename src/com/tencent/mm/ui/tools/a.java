package com.tencent.mm.ui.tools;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.format.DateFormat;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.u;
import com.tencent.mm.ui.j;
import com.tencent.mm.ui.o;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class a
{
  public static void a(Activity paramActivity, Intent paramIntent1, Intent paramIntent2, String paramString, int paramInt)
  {
    b(paramActivity, paramIntent1, paramIntent2, paramString, paramInt, null);
  }
  
  public static String b(Context paramContext, Intent paramIntent, String paramString)
  {
    Object localObject2 = null;
    Object localObject1 = null;
    Cursor localCursor = null;
    if ((paramContext == null) || (paramIntent == null) || (paramString == null))
    {
      u.e("!44@/B4Tb64lLpL3WgZWB2MnffCdxn0I3bAMmtDdvU5PFPM=", "resolvePhotoFromIntent fail, invalid argument");
      paramIntent = localCursor;
      return paramIntent;
    }
    Uri localUri = Uri.parse(paramIntent.toURI());
    localCursor = paramContext.getContentResolver().query(localUri, null, null, null, null);
    if ((localCursor != null) && (localCursor.getCount() > 0))
    {
      u.i("!44@/B4Tb64lLpL3WgZWB2MnffCdxn0I3bAMmtDdvU5PFPM=", "resolve photo from cursor");
      paramContext = (Context)localObject2;
    }
    label383:
    label386:
    for (;;)
    {
      try
      {
        if (!localUri.toString().startsWith("content://com.google.android.gallery3d")) {
          continue;
        }
        paramContext = (Context)localObject2;
        paramIntent = v(paramString, d.o(paramIntent.getData()));
        paramContext = paramIntent;
      }
      catch (Exception paramIntent)
      {
        u.printErrStackTrace("!44@/B4Tb64lLpL3WgZWB2MnffCdxn0I3bAMmtDdvU5PFPM=", paramIntent, "resolve photo error.", new Object[0]);
        continue;
      }
      paramIntent = paramContext;
      if (localCursor == null) {
        break;
      }
      localCursor.close();
      return paramContext;
      paramContext = (Context)localObject2;
      localCursor.moveToFirst();
      paramContext = (Context)localObject2;
      paramIntent = localCursor.getString(localCursor.getColumnIndex("_data"));
      paramContext = paramIntent;
      u.i("!44@/B4Tb64lLpL3WgZWB2MnffCdxn0I3bAMmtDdvU5PFPM=", "photo from resolver, path:" + paramIntent);
      paramContext = paramIntent;
      continue;
      if (paramIntent.getData() != null)
      {
        paramString = paramIntent.getData().getPath();
        paramContext = paramString;
        if (!new File(paramString).exists()) {
          paramContext = null;
        }
        u.i("!44@/B4Tb64lLpL3WgZWB2MnffCdxn0I3bAMmtDdvU5PFPM=", "photo file from data, path:" + paramContext);
        if (paramContext != null) {
          break label386;
        }
        paramContext = paramIntent.getData().getHost();
        if (new File(paramContext).exists()) {
          break label383;
        }
        paramContext = (Context)localObject1;
      }
      for (;;)
      {
        u.i("!44@/B4Tb64lLpL3WgZWB2MnffCdxn0I3bAMmtDdvU5PFPM=", "photo file from data, host:" + paramContext);
        break;
        if ((paramIntent.getAction() != null) && (paramIntent.getAction().equals("inline-data")))
        {
          paramContext = v(paramString, (Bitmap)paramIntent.getExtras().get("data"));
          u.i("!44@/B4Tb64lLpL3WgZWB2MnffCdxn0I3bAMmtDdvU5PFPM=", "resolve photo from action-inline-data:%s", new Object[] { paramContext });
          break;
        }
        if (localCursor != null) {
          localCursor.close();
        }
        u.e("!44@/B4Tb64lLpL3WgZWB2MnffCdxn0I3bAMmtDdvU5PFPM=", "resolve photo from intent failed");
        return null;
      }
    }
  }
  
  public static void b(final Activity paramActivity, Intent paramIntent1, final Intent paramIntent2, final String paramString, final int paramInt, final a parama)
  {
    boolean bool;
    if ((paramIntent1 == null) || (paramIntent1.getData() == null)) {
      if (paramIntent1 == null)
      {
        bool = true;
        u.e("!44@/B4Tb64lLpL3WgZWB2MnffCdxn0I3bAMmtDdvU5PFPM=", "param error, %b", new Object[] { Boolean.valueOf(bool) });
      }
    }
    do
    {
      return;
      bool = false;
      break;
      if (paramIntent1.getData().toString().startsWith("content://com.google.android.gallery3d")) {
        break label124;
      }
      paramIntent1 = b(paramActivity, paramIntent1, paramString);
      u.i("!44@/B4Tb64lLpL3WgZWB2MnffCdxn0I3bAMmtDdvU5PFPM=", "resolvePhotoFromIntent, filePath:%s", new Object[] { paramIntent1 });
    } while (ay.kz(paramIntent1));
    if (parama != null) {
      paramIntent2.putExtra("CropImage_OutputPath", parama.vP(paramIntent1));
    }
    paramIntent2.putExtra("CropImage_ImgPath", paramIntent1);
    paramActivity.startActivityForResult(paramIntent2, paramInt);
    return;
    label124:
    new AsyncTask()
    {
      private String filePath;
      private ProgressDialog ltP;
      private boolean ltQ;
      private Uri uri;
      
      private Integer bis()
      {
        try
        {
          if (uri == null) {
            return null;
          }
          Bitmap localBitmap = d.o(uri);
          filePath = a.v(paramString, localBitmap);
          return null;
        }
        catch (Exception localException)
        {
          u.printErrStackTrace("!44@/B4Tb64lLpL3WgZWB2MnffCdxn0I3bAMmtDdvU5PFPM=", localException, "doInBackground", new Object[0]);
        }
        return null;
      }
      
      protected final void onPreExecute()
      {
        try
        {
          uri = eYZ.getData();
          ltQ = false;
          Activity localActivity = paramActivity;
          paramActivity.getString(2131430877);
          ltP = com.tencent.mm.ui.base.g.a(localActivity, paramActivity.getString(2131431023), true, new DialogInterface.OnCancelListener()
          {
            public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
            {
              a.2.a(a.2.this);
            }
          });
          return;
        }
        catch (Exception localException)
        {
          u.printErrStackTrace("!44@/B4Tb64lLpL3WgZWB2MnffCdxn0I3bAMmtDdvU5PFPM=", localException, "onPreExecute", new Object[0]);
        }
      }
    }.execute(new Integer[] { Integer.valueOf(0) });
  }
  
  public static String v(String paramString, Bitmap paramBitmap)
  {
    try
    {
      Object localObject = com.tencent.mm.a.g.m(DateFormat.format("yyyy-MM-dd-HH-mm-ss", System.currentTimeMillis()).toString().getBytes()) + ".jpg";
      paramString = paramString + (String)localObject;
      localObject = new File(paramString);
      if (!((File)localObject).exists()) {
        ((File)localObject).createNewFile();
      }
      localObject = new BufferedOutputStream(new FileOutputStream((File)localObject));
      paramBitmap.compress(Bitmap.CompressFormat.PNG, 100, (OutputStream)localObject);
      ((BufferedOutputStream)localObject).close();
      u.i("!44@/B4Tb64lLpL3WgZWB2MnffCdxn0I3bAMmtDdvU5PFPM=", "photo image from data, path:" + paramString);
      return paramString;
    }
    catch (IOException paramString)
    {
      u.printErrStackTrace("!44@/B4Tb64lLpL3WgZWB2MnffCdxn0I3bAMmtDdvU5PFPM=", paramString, "saveBmp Error.", new Object[0]);
    }
    return null;
  }
  
  public static abstract interface a
  {
    public abstract String vP(String paramString);
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.ui.tools.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */