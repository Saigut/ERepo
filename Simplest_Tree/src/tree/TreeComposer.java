package tree;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Tree;
import org.zkoss.zul.Treeitem;
import org.zkoss.zul.TreeitemRenderer;
import data.TitleList;

public class TreeComposer extends SelectorComposer<Component> {
	private static final long serialVersionUID = -5264450789478598207L;

	@Wire("#trytree")
	private Tree trytree;

	private AbTreeModel dataTreeModel;

	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		dataTreeModel = new AbTreeModel(new TitleList().getRoot());
		trytree.setItemRenderer(new TitleTreeRenderer());
//		trytree.setMold("tree");
//		trytree.setZclass("z-vfiletree");
//		System.out.println(trytree.getStyle());
		trytree.setSclass("folder");
		trytree.setVflex(true);
		trytree.setModel(dataTreeModel);
		
//		trytree.setZclass("z-dottree");
	}

	private final class TitleTreeRenderer implements
			TreeitemRenderer<TitleTreeNode> {

		@Override
		public void render(Treeitem treeItem, TitleTreeNode treeNode, int index)
				throws Exception {

//			Treerow dataRow = new Treerow();
//			Treecell treeCell = new Treecell();
//			
//			dataRow.setSclass("folder");
//			dataRow.setParent(treeItem);
//			dataRow.appendChild(treeCell);
//			treeCell.setLabel(treeNode.getData().getItemlabel());
//			treeItem.appendChild(new Treerow().appendChild(new Treecell()));
			treeItem.setLabel(treeNode.getData().getItemlabel());
//			treeItem.
		}

	}

}
