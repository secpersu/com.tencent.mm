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

public final class ni
  extends c
{
  private final int height = 108;
  private final int width = 108;
  
  protected final int h(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 108;
      return 108;
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
      ((Paint)localObject1).setColor(-5460820);
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, 27.0F, 0.0F, 1.0F, 23.0F);
      ((Matrix)localObject2).reset();
      ((Matrix)localObject2).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject2);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject1, paramVarArgs);
      ((Paint)localObject2).set((Paint)localObject1);
      localObject3 = c.i(paramVarArgs);
      ((Path)localObject3).moveTo(19.37F, 3.98F);
      ((Path)localObject3).cubicTo(20.17F, 3.03F, 20.35F, 0.92F, 21.98F, 1.08F);
      ((Path)localObject3).cubicTo(25.32F, 0.9F, 28.67F, 0.9F, 32.01F, 1.08F);
      ((Path)localObject3).cubicTo(33.65F, 0.92F, 33.84F, 3.02F, 34.63F, 3.98F);
      ((Path)localObject3).cubicTo(40.07F, 4.15F, 45.54F, 3.71F, 50.96F, 4.18F);
      ((Path)localObject3).cubicTo(53.77F, 5.17F, 52.82F, 8.73F, 53.06F, 11.0F);
      ((Path)localObject3).lineTo(0.94F, 11.0F);
      ((Path)localObject3).cubicTo(1.2F, 8.73F, 0.19F, 5.16F, 3.03F, 4.19F);
      ((Path)localObject3).cubicTo(8.46F, 3.71F, 13.93F, 4.15F, 19.37F, 3.98F);
      ((Path)localObject3).lineTo(19.37F, 3.98F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((Paint)localObject1, paramVarArgs);
      ((Paint)localObject2).set((Paint)localObject1);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(6.0F, 14.0F);
      ((Path)localObject1).lineTo(48.0F, 14.0F);
      ((Path)localObject1).cubicTo(47.98F, 28.03F, 48.02F, 42.06F, 47.99F, 56.1F);
      ((Path)localObject1).cubicTo(48.22F, 57.86F, 47.15F, 60.03F, 45.13F, 59.93F);
      ((Path)localObject1).cubicTo(33.39F, 60.09F, 21.63F, 59.97F, 9.89F, 59.99F);
      ((Path)localObject1).cubicTo(8.12F, 60.24F, 5.99F, 59.17F, 6.07F, 57.15F);
      ((Path)localObject1).cubicTo(5.89F, 42.77F, 6.06F, 28.38F, 6.0F, 14.0F);
      ((Path)localObject1).lineTo(6.0F, 14.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(14.93F, 23.51F);
      ((Path)localObject1).cubicTo(15.04F, 32.5F, 15.06F, 41.5F, 14.92F, 50.49F);
      ((Path)localObject1).cubicTo(16.3F, 50.92F, 17.69F, 50.94F, 19.07F, 50.51F);
      ((Path)localObject1).cubicTo(18.86F, 41.95F, 19.13F, 33.4F, 18.96F, 24.85F);
      ((Path)localObject1).cubicTo(19.2F, 22.36F, 16.37F, 23.08F, 14.93F, 23.51F);
      ((Path)localObject1).lineTo(14.93F, 23.51F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(24.93F, 23.5F);
      ((Path)localObject1).cubicTo(25.04F, 32.48F, 25.07F, 41.46F, 24.91F, 50.44F);
      ((Path)localObject1).cubicTo(26.09F, 50.68F, 27.39F, 51.35F, 28.56F, 50.68F);
      ((Path)localObject1).cubicTo(29.29F, 48.89F, 28.94F, 46.9F, 29.03F, 45.02F);
      ((Path)localObject1).cubicTo(28.85F, 37.99F, 29.24F, 30.95F, 28.86F, 23.94F);
      ((Path)localObject1).cubicTo(28.15F, 22.28F, 26.18F, 23.37F, 24.93F, 23.5F);
      ((Path)localObject1).lineTo(24.93F, 23.5F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(34.93F, 23.5F);
      ((Path)localObject1).cubicTo(35.03F, 32.47F, 35.08F, 41.43F, 34.9F, 50.4F);
      ((Path)localObject1).cubicTo(36.39F, 51.04F, 39.3F, 51.61F, 38.96F, 49.03F);
      ((Path)localObject1).cubicTo(39.04F, 41.01F, 39.04F, 32.97F, 38.96F, 24.94F);
      ((Path)localObject1).cubicTo(39.29F, 22.39F, 36.43F, 23.04F, 34.93F, 23.5F);
      ((Path)localObject1).lineTo(34.93F, 23.5F);
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
 * Qualified Name:     com.tencent.mm.svg.a.a.ni
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */