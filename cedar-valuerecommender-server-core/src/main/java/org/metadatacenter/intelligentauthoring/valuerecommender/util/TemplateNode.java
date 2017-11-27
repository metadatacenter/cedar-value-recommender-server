package org.metadatacenter.intelligentauthoring.valuerecommender.util;

import org.metadatacenter.model.CedarNodeType;

import java.util.List;

/**
 * Stores path and some basic characteristics of template elements and fields
 */
public class TemplateNode {

  private String key; // json key
  private List<String> path; // List of json keys from the root (it includes the key of the current node)
  private CedarNodeType type;
  private boolean isArray;

  public TemplateNode(String key, List<String> path, CedarNodeType type, boolean isArray) {
    this.key = key;
    this.path = path;
    this.type = type;
    this.isArray = isArray;
  }

  public String getKey() {
    return key;
  }

  public List<String> getPath() {
    return path;
  }

  public CedarNodeType getType() {
    return type;
  }

  public boolean isArray() {
    return isArray;
  }

  public String generatePathDotNotation() {
    return String.join(".", path);
  }

}
