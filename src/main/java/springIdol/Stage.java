//<start id="stage_java" /> 
package springIdol;

public class Stage {
  private Stage() {
  }

  private static class StageSingletonHolder {
    static Stage instance = new Stage(); //<co id="co_lazyLoad"/>
  }

  public static Stage getInstance() {
    return StageSingletonHolder.instance; //<co id="co_returnInstance"/>
  }
}
//<end id="stage_java" />
