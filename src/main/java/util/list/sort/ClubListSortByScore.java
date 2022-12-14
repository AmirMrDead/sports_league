package util.list.sort;

import entity.Club;

import java.util.Comparator;

public class ClubListSortByScore implements Comparator<Club> {
    @Override
    public int compare(Club o1, Club o2) {
        if (o1 != null && o2 != null)
            return Integer.compare(o2.getScore(), o1.getScore());
        return 0;
    }
}
