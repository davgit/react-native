/**
* Copyright (c) Facebook, Inc. and its affiliates.
*
* This source code is licensed under the MIT license found in the
* LICENSE file in the root directory of this source tree.
*
* @generated by codegen project: GeneratePropsJavaDelegate.js
*/

package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.uimanager.LayoutShadowNode;

public class AndroidViewPagerManagerDelegate<T extends View, U extends BaseViewManagerInterface<T> & AndroidViewPagerManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
  public AndroidViewPagerManagerDelegate(U viewManager) {
    super(viewManager);
  }
  @Override
  public void setProperty(T view, String propName, @Nullable Object value) {
    switch (propName) {
      case "initialPage":
        mViewManager.setInitialPage(view, value == null ? 0 : ((Double) value).intValue());
        break;
      case "pageMargin":
        mViewManager.setPageMargin(view, value == null ? 0 : ((Double) value).intValue());
        break;
      case "peekEnabled":
        mViewManager.setPeekEnabled(view, value == null ? false : (boolean) value);
        break;
      case "keyboardDismissMode":
        mViewManager.setKeyboardDismissMode(view, (String) value);
        break;
      case "scrollEnabled":
        mViewManager.setScrollEnabled(view, value == null ? true : (boolean) value);
        break;
      default:
        super.setProperty(view, propName, value);
    }
  }

  @Override
  public void receiveCommand(T view, String commandName, ReadableArray args) {
    switch (commandName) {
      case "setPage":
        mViewManager.setPage(view, args.getInt(0));
        break;
      case "setPageWithoutAnimation":
        mViewManager.setPageWithoutAnimation(view, args.getInt(0));
        break;
    }
  }
}
