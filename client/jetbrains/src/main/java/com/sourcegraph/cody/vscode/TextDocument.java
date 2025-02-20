package com.sourcegraph.cody.vscode;

import com.sourcegraph.cody.completions.CompletionDocumentContext;
import java.net.URI;

public interface TextDocument {
  URI uri();

  String fileName();

  int offsetAt(Position position);

  String getText();

  String getText(Range range);

  Position positionAt(int offset);

  CompletionDocumentContext getCompletionContext(int offset);
}
