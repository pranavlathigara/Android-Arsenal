package com.lovejjfg.arsenal.api.mode;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

/**
 * Created by Joe on 2017/3/7.
 * Email lovejjfg@gmail.com
 */

public class ArsenalListInfo implements Parcelable {


    public String getHasMore() {
        return hasMore;
    }

    public void setHasMore(String hasMore) {
        this.hasMore = hasMore;
    }

    public ArrayList<ListInfo> getInfos() {
        return infos;
    }

    public void setInfos(ArrayList<ListInfo> infos) {
        this.infos = infos;
    }

    private String hasMore;
    private ArrayList<ListInfo> infos;

    public static class ListInfo implements Parcelable {

        private String title;
        private String listDetailUrl;
        private String tagUrl;
        private String tag;

        private boolean badgeFree;
        private boolean badgeNew;

        private String desc;
        private String imgUrl;

        private String registeredDate;

        private boolean isAndroid;
        private boolean isUser;
        private String userName;
        private String userDetailUrl;

        public ListInfo(boolean badgeFree, boolean badgeNew, String date, String desc, String imgUrl, boolean isAndroid, boolean isUser, String tag, String tagUrl, String title, String listDetailUrl, String userDetailUrl, String userName) {
            this.userName = userName;
            this.badgeFree = badgeFree;
            this.badgeNew = badgeNew;
            this.desc = desc;
            this.imgUrl = imgUrl;
            this.isAndroid = isAndroid;
            this.isUser = isUser;
            this.listDetailUrl = listDetailUrl;
            this.registeredDate = date;
            this.tag = tag;
            this.tagUrl = tagUrl;
            this.title = title;
            this.userDetailUrl = userDetailUrl;
        }

        public boolean isBadgeFree() {
            return badgeFree;
        }

        public boolean isBadgeNew() {
            return badgeNew;
        }

        public String getDesc() {
            return desc;
        }

        public String getImgUrl() {
            return imgUrl;
        }

        public boolean isAndroid() {
            return isAndroid;
        }

        public boolean isUser() {
            return isUser;
        }

        public String getListDetailUrl() {
            return listDetailUrl;
        }

        public String getRegisteredDate() {
            return registeredDate;
        }

        public String getTag() {
            return tag;
        }

        public String getTagUrl() {
            return tagUrl;
        }

        public String getTitle() {
            return title;
        }

        public String getUserDetailUrl() {
            return userDetailUrl;
        }

        public String getUserName() {
            return userName;
        }


        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.title);
            dest.writeString(this.listDetailUrl);
            dest.writeString(this.tagUrl);
            dest.writeString(this.tag);
            dest.writeByte(this.badgeFree ? (byte) 1 : (byte) 0);
            dest.writeByte(this.badgeNew ? (byte) 1 : (byte) 0);
            dest.writeString(this.desc);
            dest.writeString(this.imgUrl);
            dest.writeString(this.registeredDate);
            dest.writeByte(this.isAndroid ? (byte) 1 : (byte) 0);
            dest.writeByte(this.isUser ? (byte) 1 : (byte) 0);
            dest.writeString(this.userName);
            dest.writeString(this.userDetailUrl);
        }

        public ListInfo() {
        }

        protected ListInfo(Parcel in) {
            this.title = in.readString();
            this.listDetailUrl = in.readString();
            this.tagUrl = in.readString();
            this.tag = in.readString();
            this.badgeFree = in.readByte() != 0;
            this.badgeNew = in.readByte() != 0;
            this.desc = in.readString();
            this.imgUrl = in.readString();
            this.registeredDate = in.readString();
            this.isAndroid = in.readByte() != 0;
            this.isUser = in.readByte() != 0;
            this.userName = in.readString();
            this.userDetailUrl = in.readString();
        }

        public static final Creator<ListInfo> CREATOR = new Creator<ListInfo>() {
            @Override
            public ListInfo createFromParcel(Parcel source) {
                return new ListInfo(source);
            }

            @Override
            public ListInfo[] newArray(int size) {
                return new ListInfo[size];
            }
        };
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.hasMore);
        dest.writeTypedList(this.infos);
    }

    public ArsenalListInfo() {
    }

    protected ArsenalListInfo(Parcel in) {
        this.hasMore = in.readString();
        this.infos = in.createTypedArrayList(ListInfo.CREATOR);
    }

    public static final Creator<ArsenalListInfo> CREATOR = new Creator<ArsenalListInfo>() {
        @Override
        public ArsenalListInfo createFromParcel(Parcel source) {
            return new ArsenalListInfo(source);
        }

        @Override
        public ArsenalListInfo[] newArray(int size) {
            return new ArsenalListInfo[size];
        }
    };
}
