package xyz.lgjt;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    public List<Integer> sort(List<Integer> src) {
        int mid = (src.size() / 2) - 1;


        List<Integer> left = getLeft(src, mid);
        List<Integer> right = getRight(src, mid);

        if (left.size() != 1)
            left = sort(left);

        if (right.size() != 1)
            right = sort(right);


        return merge(left, right, mid);
    }

    private List<Integer> merge(List<Integer> left, List<Integer> right, int mid) {


        int totSize = left.size() + right.size();
        List<Integer> list = new ArrayList<>();
        int li = 0, ri = 0, k = 0;

        // sort and add to the list;
        while (li < left.size() && ri < right.size()) {
            if (left.get(li) <= right.get(ri)) {
                list.add(left.get(li));
                li++;
            } else {
                list.add(right.get(ri));
                ri++;
            }
            k++;
        }

        while (li < Math.max(left.size() , 1) || li < (totSize / 2)) {
            list.add(left.get(li));
            li++;
        }

        while (ri < Math.max(right.size() , 1) || ri < (totSize / 2)) {
            list.add(right.get(ri));
            ri++;
        }

        return list;
    }

    private List<Integer> getLeft(List<Integer> src, int m) {
        List<Integer> tmp = new ArrayList<>();
        for (int i = 0; i <= m; i++) {
            tmp.add(src.get(i));
        }
        return tmp;
    }

    private List<Integer> getRight(List<Integer> src, int m) {
        List<Integer> tmp = new ArrayList<>();
        for (int i = m + 1; i <= src.size() - 1; i++) {
            tmp.add(src.get(i));
        }
        return tmp;
    }

}
