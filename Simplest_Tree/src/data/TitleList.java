package data;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import tree.TitleTreeNode;

import data.pojo.Title;

public class TitleList {
	public final static String Title = "Title";

	private TitleTreeNode root;

	private JSONArray jArray;

	public TitleList() throws JSONException {
		jArray = new JSONArray(
				"[{'id':'1','name':'信息发布','pid':'0'}, {'id':'2','name':'信息','pid':'1'}, {'id':'3','name':'发布','pid':'1'}, {'id':'4','name':'信布','pid':'2'}]");

		if (jArray.length() == 0)
			root = null;
		else
			root = generateChildren(0);

	}

	private TitleTreeNode generateChildren(int index) throws JSONException {
		ArrayList<TitleTreeNode> children = new ArrayList<TitleTreeNode>();

		for (int childIndex = 0; childIndex < jArray.length(); childIndex++)
			if (jArray.getJSONObject(childIndex).getInt("pid") == jArray
					.getJSONObject(index).getInt("id"))
				children.add(generateChildren(childIndex));

		if (children.isEmpty())
			return new TitleTreeNode(new Title(jArray.getJSONObject(index)
					.getString("name")));
		else
			return new TitleTreeNode(new Title(jArray.getJSONObject(index)
					.getString("name")),
					(TitleTreeNode[]) children
							.toArray(new TitleTreeNode[children.size()]));
		// if (children.isEmpty())
		// return new TitleTreeNode(null);
		// else
		// return new TitleTreeNode(null,
		// (TitleTreeNode[]) children.toArray());
	}

	public TitleTreeNode getRoot() {
		return root;
	}
}
