package com.tencent.mm.plugin.ext.a;

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

public final class a
{
  private static char[] cAP = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
  private static SecretKey dKw = null;
  
  private static void Vt()
  {
    try
    {
      if (dKw == null)
      {
        ObjectInputStream localObjectInputStream = new ObjectInputStream(new ByteArrayInputStream(lj("aced00057372001f6a617661782e63727970746f2e737065632e5365637265744b6579537065635b470b66e230614d0200024c0009616c676f726974686d7400124c6a6176612f6c616e672f537472696e673b5b00036b65797400025b427870740003414553757200025b42acf317f8060854e0020000787000000010402a2173bd6f2542e5e71ee414b2e1e8")));
        dKw = (SecretKey)localObjectInputStream.readObject();
        localObjectInputStream.close();
      }
      return;
    }
    catch (Exception localException) {}
  }
  
  public static String bc(long paramLong)
  {
    byte[] arrayOfByte = nQ(String.valueOf(paramLong));
    if (arrayOfByte == null) {
      return null;
    }
    StringBuilder localStringBuilder = new StringBuilder(arrayOfByte.length * 2);
    int i = 0;
    while (i < arrayOfByte.length)
    {
      localStringBuilder.append(cAP[((arrayOfByte[i] & 0xF0) >>> 4)]);
      localStringBuilder.append(cAP[(arrayOfByte[i] & 0xF)]);
      i += 1;
    }
    return localStringBuilder.toString();
  }
  
  private static byte[] lj(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0)) {
      return null;
    }
    byte[] arrayOfByte = new byte[paramString.length() / 2];
    int i = 0;
    while (i < arrayOfByte.length)
    {
      arrayOfByte[i] = ((byte)Integer.parseInt(paramString.substring(i * 2, i * 2 + 2), 16));
      i += 1;
    }
    return arrayOfByte;
  }
  
  private static byte[] nQ(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0)) {
      return null;
    }
    Vt();
    Cipher localCipher = Cipher.getInstance("AES");
    localCipher.init(1, dKw);
    return localCipher.doFinal(paramString.getBytes("UTF8"));
  }
  
  private static String nR(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0)) {
      return null;
    }
    Vt();
    Cipher localCipher = Cipher.getInstance("AES");
    localCipher.init(2, dKw);
    return new String(localCipher.doFinal(lj(paramString)), "UTF8");
  }
  
  public static long nS(String paramString)
  {
    return Long.valueOf(nR(paramString).trim()).longValue();
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.plugin.ext.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */