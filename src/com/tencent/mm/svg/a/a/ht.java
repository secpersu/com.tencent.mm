package com.tencent.mm.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;

public final class ht
  extends c
{
  private final int height = 84;
  private final int width = 84;
  
  protected final int h(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 84;
      return 84;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject2 = c.e(paramVarArgs);
      Object localObject3 = c.d(paramVarArgs);
      Paint localPaint1 = c.h(paramVarArgs);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.FILL);
      Object localObject1 = c.h(paramVarArgs);
      ((Paint)localObject1).setFlags(385);
      ((Paint)localObject1).setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      ((Paint)localObject1).setStrokeWidth(1.0F);
      ((Paint)localObject1).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject1).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject1).setStrokeMiter(4.0F);
      ((Paint)localObject1).setPathEffect(null);
      Paint localPaint2 = c.a((Paint)localObject1, paramVarArgs);
      localPaint2.set((Paint)localObject1);
      localPaint2.setStrokeWidth(1.0F);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      ((Paint)localObject1).set(localPaint1);
      ((Paint)localObject1).setColor(-10526881);
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, 8.0F, 0.0F, 1.0F, 12.0F);
      ((Matrix)localObject2).reset();
      ((Matrix)localObject2).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject2);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject1, paramVarArgs);
      ((Paint)localObject2).set((Paint)localObject1);
      localObject3 = c.i(paramVarArgs);
      ((Path)localObject3).moveTo(46.01F, 0.01F);
      ((Path)localObject3).cubicTo(53.34F, 6.17F, 60.67F, 12.34F, 68.0F, 18.5F);
      ((Path)localObject3).cubicTo(60.71F, 24.71F, 53.32F, 30.81F, 46.01F, 36.99F);
      ((Path)localObject3).cubicTo(45.99F, 33.32F, 46.0F, 29.65F, 46.0F, 25.98F);
      ((Path)localObject3).cubicTo(38.87F, 26.16F, 30.95F, 26.38F, 25.17F, 31.13F);
      ((Path)localObject3).cubicTo(21.73F, 33.95F, 19.85F, 38.09F, 17.96F, 42.0F);
      ((Path)localObject3).cubicTo(18.18F, 31.95F, 21.11F, 20.87F, 29.62F, 14.66F);
      ((Path)localObject3).cubicTo(34.26F, 11.04F, 40.36F, 10.72F, 45.99F, 11.02F);
      ((Path)localObject3).cubicTo(46.0F, 7.35F, 46.0F, 3.68F, 46.01F, 0.01F);
      ((Path)localObject3).lineTo(46.01F, 0.01F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((Paint)localObject1, paramVarArgs);
      ((Paint)localObject2).set((Paint)localObject1);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(1.01F, 14.82F);
      ((Path)localObject1).cubicTo(0.72F, 13.08F, 1.91F, 10.96F, 3.85F, 11.06F);
      ((Path)localObject1).cubicTo(9.89F, 10.89F, 15.94F, 11.07F, 21.98F, 10.99F);
      ((Path)localObject1).cubicTo(20.17F, 13.11F, 18.65F, 15.46F, 17.46F, 17.99F);
      ((Path)localObject1).cubicTo(14.31F, 18.0F, 11.15F, 18.0F, 8.0F, 18.0F);
      ((Path)localObject1).lineTo(8.0F, 52.0F);
      ((Path)localObject1).lineTo(54.0F, 52.0F);
      ((Path)localObject1).lineTo(54.0F, 40.15F);
      ((Path)localObject1).cubicTo(56.32F, 38.16F, 58.66F, 36.19F, 60.99F, 34.23F);
      ((Path)localObject1).cubicTo(60.96F, 41.53F, 61.09F, 48.83F, 60.94F, 56.13F);
      ((Path)localObject1).cubicTo(61.0F, 58.1F, 58.89F, 59.32F, 57.1F, 59.0F);
      ((Path)localObject1).cubicTo(39.37F, 58.97F, 21.63F, 59.07F, 3.9F, 58.95F);
      ((Path)localObject1).cubicTo(1.9F, 59.06F, 0.69F, 56.9F, 1.01F, 55.11F);
      ((Path)localObject1).cubicTo(1.0F, 41.68F, 0.99F, 28.25F, 1.01F, 14.82F);
      ((Path)localObject1).lineTo(1.01F, 14.82F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.svg.a.a.ht
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */