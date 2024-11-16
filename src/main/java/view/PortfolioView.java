package view;

import javax.swing.*;
import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * The View for when the user is on the portfolio view.
 */
public class PortfolioView extends JPanel implements PropertyChangeListener {
    private final String viewName = "Portfolio";
    //    private final PortfolioViewModel portfolioViewModel;
    private final JLabel passwordErrorField = new JLabel();
//    private ChangePasswordController changePasswordController;
//    private PortfolioController portfolioController;

//    private final JLabel balance;

    private final JButton portfolio;
    private final JButton balanceStats;
    private final JButton transaction;
    private final JButton history;

    public PortfolioView() {
//        this.loggedInViewModel = loggedInViewModel;
//        this.loggedInViewModel.addPropertyChangeListener(this);

        final JLabel title = new JLabel("Portfolio Screen");
        title.setAlignmentX(Component.CENTER_ALIGNMENT);

        final JLabel balance = new JLabel(String.valueOf(1000.0));
        balance.setAlignmentX(Component.CENTER_ALIGNMENT);

        final JPanel buttons = new JPanel();
        portfolio = new JButton("Portfolio");
        buttons.add(portfolio);

        balanceStats = new JButton("Balance Statistics");
        buttons.add(balanceStats);

        transaction = new JButton("Transaction");
        buttons.add(transaction);

        history = new JButton("History");
        buttons.add(history);

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
    }

    public String getViewName() {
        return viewName;
    }

    /**
     * Hi.
     */
    public void setPortfolioController() {
        // TODO: save the logout controller in the instance variable.
        // this.portfolioController = portfolioController;
    }
}
