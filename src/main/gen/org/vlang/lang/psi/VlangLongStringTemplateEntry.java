// This is a generated file. Not intended for manual editing.
package org.vlang.lang.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface VlangLongStringTemplateEntry extends VlangCompositeElement {

  @Nullable
  VlangExpression getExpression();

  @Nullable
  VlangFormatSpecifier getFormatSpecifier();

  @Nullable
  PsiElement getTemplateEntryEnd();

  @NotNull
  PsiElement getTemplateEntryStart();

}
