package net.p_side.android.android_sandbox;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class SomeFragment extends Fragment {

    @Bind(R.id.textView)
    TextView mTextView;

    int mIndex;

    public static SomeFragment newInstance(int index) {
        Bundle args = new Bundle();
        args.putInt("index", index);

        SomeFragment fragment = new SomeFragment();
        fragment.setArguments(args);
        return fragment;
    }

    public SomeFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle args = getArguments();
        mIndex = args.getInt("index");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_some, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mTextView.setText("Some Fragment:" + mIndex);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }
}
