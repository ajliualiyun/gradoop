package org.gradoop.model.impl.functions.graphcontainment;

import org.gradoop.model.api.EPGMGraphElement;

public class InAllGraphsBroadcast
  <GE extends EPGMGraphElement>
  extends GraphsContainmentFilterBroadcast<GE> {

  @Override
  public boolean filter(GE element) throws Exception {

    return element.getGraphIds().containsAll(this.graphIds);
  }
}